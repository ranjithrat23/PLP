package com.cg.spring.exception;

public interface IPaymentException {

	String cardNumberException = "Enter Valid Card Number ";
	String CVVException = "Enter Valid CVV";
	String ExpiryDateException = "Enter Valid ExpiryYear";
	
	String userNameException="Note: Enter the Starting letter as Capitals and give atleast 8 characters";
	String PasswordException="Enter atleast 8 characters";
	String mobileException = "Enter valid mobile number";
}
