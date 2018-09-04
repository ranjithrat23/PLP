package com.cg.spring.beans;

public class CardDetails {
	
	private String cardNumber;
	private String CVVNumber;
	private String cardYear;
	private String cardMonth;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCVVNumber() {
		return CVVNumber;
	}
	public void setCVVNumber(String cVVNumber) {
		CVVNumber = cVVNumber;
	}
	public String getCardYear() {
		return cardYear;
	}
	public void setCardYear(String cc_exp_yyyy) {
		this.cardYear = cc_exp_yyyy;
	}
	public String getCardMonth() {
		return cardMonth;
	}
	public void setCardMonth(String cc_exp_mm) {
		this.cardMonth = cc_exp_mm;
	}
		
	
}
