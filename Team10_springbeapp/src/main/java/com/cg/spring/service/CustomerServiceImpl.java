package com.cg.spring.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.beans.Admin;
import com.cg.spring.beans.CardDetails;
import com.cg.spring.beans.Cart;
import com.cg.spring.beans.Customer;
import com.cg.spring.beans.Product;
import com.cg.spring.exception.IPaymentException;
import com.cg.spring.exception.PaymentException;
import com.cg.spring.repo.IAdminRepo;
import com.cg.spring.repo.ICartRepo;
import com.cg.spring.repo.ICustomerRepo;
import com.cg.spring.repo.IProductRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepo repo;
	@Autowired
	ICartRepo cartRepo;
	@Autowired
	IProductRepo productRepo;
	@Autowired
	IAdminRepo adminRepo;

	@Override
	public List<Customer> showAll() {
		List<Customer> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

	@Override
	public List<Product> cartProducts(String customerId) {

		List<Cart> cartList = new ArrayList<>();
		List<Product> list = new ArrayList<>();
		cartRepo.findAll().forEach(cartList::add);

		for (Cart cart : cartList) {
			String cusId = cart.getCustomerEmail();
			int prodId = cart.getProductId();
			if (cusId.equals(customerId)) {
				Product product = productRepo.findById(prodId).get();
				list.add(product);
			}
		}
		return list;
	}

	@Override
	public void addCart(String customerId, int productId) {

		Cart cart = new Cart();
		cart.setCustomerEmail(customerId);
		cart.setProductId(productId);
		cartRepo.save(cart);
	}

	@Override
	public void remove(String customerId, int productId) {
		List<Cart> cartList = new ArrayList<>();
		cartRepo.findAll().forEach(cartList::add);
		for (Cart cart : cartList) {
			String custId = cart.getCustomerEmail();
			int prodId = cart.getProductId();
			int id = cart.getSerialNo();
			if (prodId == productId && custId.equals(customerId)) {
				cartRepo.deleteById(id);
				break;
			}
		}
	}

	public boolean validate(String uname, String psw) throws PaymentException {

		boolean result = false;

		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z0-9]{7,}");
		Matcher matcher = pattern.matcher(uname);
		if (!(matcher.matches())) {
			throw new PaymentException(IPaymentException.userNameException);
		} else {
			result = true;
		}
		Pattern patternPassword = Pattern.compile("[A-Za-z0-9@$#!^&%*]{8,}");
		Matcher matcherPassword = patternPassword.matcher(psw);
		if (!(matcherPassword.matches())) {
			throw new PaymentException(IPaymentException.PasswordException);
		} else {
			result = true;
		}
		return result;
	}

	public boolean validation(CardDetails cardDetails) throws PaymentException {

		boolean result = false;
		Pattern pattern = Pattern.compile("[0-9]{16}");
		Matcher matcher = pattern.matcher(cardDetails.getCardNumber());
		if (!(matcher.matches())) {
			result = false;
			throw new PaymentException(IPaymentException.cardNumberException);
		} else {
			result = true;
		}
		Pattern patternCvv = Pattern.compile("[0-9]{3,4}");
		Matcher matcherCvv = patternCvv.matcher(cardDetails.getCVVNumber());
		if (!(matcherCvv.matches())) {
			result = false;
			throw new PaymentException(IPaymentException.CVVException);
		} else {
			result = true;
		}

		LocalDate today = LocalDate.now();
		int month = today.getMonth().getValue();
		int year = today.getYear();
		int mm = Integer.parseInt(cardDetails.getCardMonth());
		int yyyy = Integer.parseInt(cardDetails.getCardYear());
		if (yyyy > year) {
			result = true;
		} else if ((yyyy == year) && (mm > month)) {
			result = true;
		} else {
			result = false;
			throw new PaymentException(IPaymentException.ExpiryDateException);
		}
		return result;
	}

	@Override
	public void payment(String email, int adminId) {

		List<Product> products = cartProducts(email);
		double amount = 0;
		for (Product product : products) {
			amount += product.getProductPrice();
			remove(email, product.getProductId());
		}
		
		Admin admin = adminRepo.findById(adminId).get();
		admin.setAdminWallet(admin.getAdminWallet() + amount);
		adminRepo.save(admin);
	}

	@Override
	public boolean validateWallet(String mobile, String password) throws PaymentException {
		boolean result = false;

		Pattern pattern = Pattern.compile("[0-9]{10}");
		Matcher matcher = pattern.matcher(mobile);
		if (!(matcher.matches())) {
			throw new PaymentException(IPaymentException.mobileException);
		} else {

			result = true;
		}

		Pattern patternPassword = Pattern.compile("[A-Za-z0-9@$#!^&%*]{8,}");
		Matcher matcherPassword = patternPassword.matcher(password);
		if (!(matcherPassword.matches())) {
			throw new PaymentException(IPaymentException.PasswordException);
		} else {
			result = true;
		}
		return result;
	}

	@Override
	public List<Product> products() {

		List<Product> list=new ArrayList<>();
		productRepo.findAll().forEach(list::add);		
		return list;
	}

}
