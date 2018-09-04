package com.cg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	@RequestMapping("/")
	public String showAll() {
		return "login";
	}

	@RequestMapping("/payment")
	public String payment() {
		return "paymentpage1";
	}

	@RequestMapping("/credit")
	public String credit() {
		return "credit";
	}

	@RequestMapping("/netbanking")
	public String netbanking() {
		return "netbanking";
	}

	@RequestMapping("/netbanking2")
	public String netbanking2() {
		return "netbanking2";
	}

	@RequestMapping("/cashondelivery")
	public String cashondelivery() {
		return "cashondelivery";
	}

	@RequestMapping("/googlepay")
	public String tez() {
		return "googlepay";
	}

	@RequestMapping("/paytm")
	public String paytm() {
		return "paytm";
	}

	@RequestMapping("/wallet")
	public String wallet() {
		return "wallet";
	}

	@RequestMapping("/phonepe")
	public String phonepe() {
		return "phonepe";
	}

	@RequestMapping("/mobikwik")
	public String mobikwik() {
		return "mobikwik";
	}
	
	@RequestMapping("/session")
	public String session() {
		return "session";
	}
}
