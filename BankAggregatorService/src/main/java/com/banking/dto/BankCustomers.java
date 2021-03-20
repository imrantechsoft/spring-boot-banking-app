package com.banking.dto;

import java.util.List;

import com.banking.model.Customer;

import lombok.Data;


@Data
public class BankCustomers {
	
	List<Customer> customerList;

}
