package com.cg.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.beans.Product;

@RestController
public class FrontEndController {

	@RequestMapping("/cart")
	public ModelAndView cartProducts(@RequestParam String email) {
		RestTemplate restTemplate = new RestTemplate();
		List<Product> list = restTemplate.getForObject("http://localhost:7070/cart?customerId=" + email,
				ArrayList.class);
		if (list.isEmpty()) {
			return new ModelAndView("empty");
		}
		return new ModelAndView("cart", "cartProduct", list);
	}

	@RequestMapping("/loggedin")
	public ModelAndView home() {
		RestTemplate restTemplate=new RestTemplate();
		List<Product> list=restTemplate.getForObject("http://localhost:7070", ArrayList.class);
		return new ModelAndView("index","products",list);
	}
	
	@RequestMapping("/addToCart")
	public ModelAndView addCartProducts(@RequestParam String email2, @RequestParam int product) {
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject(
				"http://localhost:7070/addToCart?customerId=" + email2 + "&productId=" + product, String.class);
		return home();
			
	}

	@RequestMapping("/removeCart")
	public ModelAndView removeCartProducts(@RequestParam String customerId, @RequestParam int productId) {
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject(
				"http://localhost:7070/remove?customerId=" + customerId + "&productId=" + productId, String.class);
		return home();
	}

	@RequestMapping("/payment/card")
	public ModelAndView paymentCard(@SessionAttribute String email, @RequestParam String cc_num, @RequestParam String cvv,
			@RequestParam String cc_exp_mm, @RequestParam String cc_exp_yyyy) {
		RestTemplate rt = new RestTemplate();

		String str = rt.getForObject("http://localhost:7070/payment/card?email=" + email + "&cc_num=" + cc_num + "&cvv="
				+ cvv + "&cc_exp_mm=" + cc_exp_mm + "&cc_exp_yyyy=" + cc_exp_yyyy, String.class);
		if (str.equals("Successfully Credited to Admin's Wallet")) {
			return new ModelAndView("message", "message", str);
		} else {
			return new ModelAndView("credit", "message", str);
		}
	}

	@RequestMapping("/payment/net")
	public ModelAndView paymentNet(@SessionAttribute String email, @RequestParam String uname, @RequestParam String psw) {
		RestTemplate rt = new RestTemplate();
		String str = rt.getForObject(
				"http://localhost:7070/payment/net?email=" + email + "&uname=" + uname + "&psw=" + psw, String.class);
		if (str.equals("Successfully Credited to Admin's Wallet")) {
			return new ModelAndView("message", "message", str);
		} else {
			return new ModelAndView("netbanking2", "message", str);
		}
	}

	@RequestMapping("/payment/wallet")
	public ModelAndView paymentWallet(@SessionAttribute String email, @RequestParam String mobile,
			@RequestParam String password) {
		RestTemplate rt = new RestTemplate();
		String str = rt.getForObject(
				"http://localhost:7070/payment/wallet?email=" + email + "&mobile=" + mobile + "&password=" + password,
				String.class);
		if (str.equals("Successfully Credited to Admin's Wallet")) {
			return new ModelAndView("message", "message", str);
		} else {
			return new ModelAndView("wallet", "message", str);
		}
	}
	
}
