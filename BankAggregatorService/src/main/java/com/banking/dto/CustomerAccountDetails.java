package com.banking.dto;

import com.banking.model.Account;
import com.banking.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAccountDetails {
	
	private Customer customer;
	
	private Account account;
	

}
