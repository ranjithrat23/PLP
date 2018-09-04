package com.cg.spring.service;

import java.util.List;

import com.cg.spring.beans.CardDetails;
import com.cg.spring.beans.Customer;
import com.cg.spring.beans.Product;
import com.cg.spring.exception.PaymentException;

public interface ICustomerService {

	public List<Customer> showAll();

	public List<Product> cartProducts(String customerId);

	public void remove(String customerId, int productId);

	void addCart(String customerId, int productId);

	void payment(String email, int adminId);

	public boolean validation(CardDetails cardDetails) throws PaymentException;

	public boolean validate(String uname, String psw) throws PaymentException;

	public boolean validateWallet(String mobile, String password) throws PaymentException;

	public List<Product> products();
}
