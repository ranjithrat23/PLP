package com.cg.spring.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
