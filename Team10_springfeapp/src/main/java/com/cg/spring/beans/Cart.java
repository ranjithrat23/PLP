package com.cg.spring.beans;

public class Cart {

	private int serialNo;
	private String customerEmail;
	private int productId;

	public Cart() {

	}

	public Cart(int serialNo, String customerEmail, int productId) {
		super();
		this.serialNo = serialNo;
		this.customerEmail = customerEmail;
		this.productId = productId;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
