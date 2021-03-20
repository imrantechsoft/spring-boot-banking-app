package com.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Account;
import com.banking.model.RandomUtil;

@RestController
@RequestMapping("/transaction")
public class TransactionController {



	@GetMapping("/hello")
	public String welcomeUser() {
		return "Hello User! Welcome to India Bank Transactions";
	}

	@GetMapping("/accountDetails/{customerId}")	
	public Account getAccountDetails(@PathVariable String customerId) {

		Long accNum = RandomUtil.generateRandomNumber();
		Double balance = RandomUtil.generateDoubleNumber();
		return new Account(customerId,accNum, balance);
	}



}
