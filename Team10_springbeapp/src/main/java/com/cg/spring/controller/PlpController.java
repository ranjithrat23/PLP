package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.beans.CardDetails;
import com.cg.spring.beans.Product;
import com.cg.spring.exception.PaymentException;
import com.cg.spring.service.ICustomerService;

@RestController
public class PlpController {
	@Autowired
	ICustomerService service;

	@RequestMapping("/")
	public List<Product> products() {
		List<Product> list = service.products();
		return list;
	}

	@RequestMapping("/cart")
	public List<Product> cartProducts(@RequestParam String customerId) {
		List<Product> list = service.cartProducts(customerId);
		return list;
	}

	@RequestMapping(value = "/addToCart{customerId}{productId}")
	public String addCart(@RequestParam String customerId, @RequestParam int productId) {

		service.addCart(customerId, productId);
		return "Added";
	}

	@RequestMapping(value = "/remove{customerId}{productId}")
	public String remove(@RequestParam String customerId, @RequestParam int productId) {
		service.remove(customerId, productId);
		return "Removed";
	}

	@RequestMapping(value = "/payment/card{email}{cc_num}{cvv}{cc_exp_mm}{cc_exp_yyyy}")
	public String paymentCard(@RequestParam String email, @RequestParam String cc_num, @RequestParam String cvv,
			@RequestParam String cc_exp_mm, @RequestParam String cc_exp_yyyy) {
		int adminId = 1;
		CardDetails cardDetails = new CardDetails();
		cardDetails.setCardNumber(cc_num);
		cardDetails.setCardMonth(cc_exp_mm);
		cardDetails.setCardYear(cc_exp_yyyy);
		cardDetails.setCVVNumber(cvv);

		try {
			if (service.validation(cardDetails)) {
				service.payment(email, adminId);
				return "Successfully Credited to Admin's Wallet";
			} else {
				return "Not Successfully Credited to Admin's Wallet";
			}
		} catch (PaymentException e) {
			return e.getMessage();
		}

	}

	@RequestMapping(value = "/payment/net{email}{uname}{psw}")
	public String paymentNet(@RequestParam String email, @RequestParam String uname, @RequestParam String psw) {
		int adminId = 1;
		try {
			if (service.validate(uname, psw)) {
				service.payment(email, adminId);
				return "Successfully Credited to Admin's Wallet";
			} else {
				return "Not Successfully Credited to Admin's Wallet";
			}
		} catch (PaymentException e) {
			return e.getMessage();
		}
	}

	@RequestMapping(value = "/payment/wallet{email}{mobile}{password}")
	public String paymentWallet(@RequestParam String email, @RequestParam String mobile,
			@RequestParam String password) {
		int adminId = 1;
		try {
			if (service.validateWallet(mobile, password)) {
				service.payment(email, adminId);
				return "Successfully Credited to Admin's Wallet";
			} else {
				return "Not Successfully Credited to Admin's Wallet";
			}
		} catch (PaymentException e) {
			return e.getMessage();
		}
	}
}
