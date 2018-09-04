package com.cg.spring.beans;

public class Customer {
	private int id;
	private String name;
	private String mail;
	private String mobile;

	public Customer() {

	}

	public Customer(int id, String name, String mail, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
