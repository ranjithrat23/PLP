package com.cg.spring.beans;

public class Admin {

	private int adminId;
	private String adminPassword;
	private double adminWallet;

	public Admin() {

	}

	public Admin(int adminId, String adminPassword, double adminWallet) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		this.adminWallet = adminWallet;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public double getAdminWallet() {
		return adminWallet;
	}

	public void setAdminWallet(double adminWallet) {
		this.adminWallet = adminWallet;
	}

}
