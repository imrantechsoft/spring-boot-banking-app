package com.banking.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bank.Bank;


@RestController
@RequestMapping("/profile")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/helloBank")
	public String sayHelloBank() {
		return "Hello Bank!  I am customer your customer";
	}

	@PostMapping("/banks/{bankName}/customers")
	public void addCustomer(@PathVariable String bankName, @RequestBody Customer customer){
		customer.setBank(new Bank(bankName, "", ""));
		System.out.println("Inside addCustomer");
		customerService.addCustomer(customer);
	}

	@GetMapping("/banks/{bankName}/customers")
	public BankCustomers getBankCustomers(@PathVariable String bankName){
		BankCustomers bankCustomers = new BankCustomers();
		System.out.println("Inside getBankCustomers");
		bankCustomers.setCustomerList(customerService.getBankCustomers(bankName));
		return bankCustomers;
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("Inside getAllCustomers");
		return customerService.getAllCustomers();
	}

	@GetMapping("/customers/{customerName}")
	public Optional<Customer> getCustomer(@PathVariable String customerName) {
		System.out.println("Inside getCustomer");
		return customerService.getCustomer(customerName);
	}

	@PutMapping("/banks/{bankName}/customers")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String bankName) {
		System.out.println("Inside updateCustomer");
		customer.setBank(new Bank(bankName,"",""));
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/customers/{customerName}")
	public void deleteCustomer(@PathVariable String customerName) {
		System.out.println("Inside deleteCustomer");
		customerService.deleteCustomer(customerName);
	}

	@GetMapping("/customers/customerSeedData")
	public void seedData(){

		customerService.addCustomer(new Customer("Imran","imran@gmail.com","9312345679","Hyderabad","HDFC"));
		customerService.addCustomer(new Customer("Vilas","vilas@gmail.com","9123456785","Kerala","HDFC"));
		customerService.addCustomer(new Customer("Swapna","swapna@gmail.com","9123456785","Odisha","HDFC"));
		customerService.addCustomer(new Customer("Nagendra","nagendra@gmail.com","9123456785","Bangalore","HDFC"));
		customerService.addCustomer(new Customer("John","john@gmail.com","9123456785","California","HDFC"));
		customerService.addCustomer(new Customer("Sai","sai@gmail.com","9123456785","Chennai","HDFC"));
		customerService.addCustomer(new Customer("Abraham","abraham@gmail.com","9123456785","Mumbai","HDFC"));


		customerService.addCustomer(new Customer("Arav","arav@gmail.com","9123456785","Kanpur","SBI"));
		customerService.addCustomer(new Customer("Leena","leena@gmail.com","9123456785","Jodhpur","SBI"));
		customerService.addCustomer(new Customer("Catherine","cath@gmail.com","9123456785","Srilanka","SBI"));
		customerService.addCustomer(new Customer("Anau","anau@gmail.com","9123456785","Uttarakhand","SBI"));
		customerService.addCustomer(new Customer("Preeti","preeti@gmail.com","9123456785","Jaipur","SBI"));


		customerService.addCustomer(new Customer("Ehsaan","ehsaan@gmail.com","9123456785","Washi","ICICI"));
		customerService.addCustomer(new Customer("Hardik","hardik@gmail.com","9123456785","Kochin","ICICI"));
		customerService.addCustomer(new Customer("Arav","arav@gmail.com","9123456785","Andhra","ICICI"));
		customerService.addCustomer(new Customer("Jaiyush","jaiyush@gmail.com","9123456785","Telangana","ICICI"));
		customerService.addCustomer(new Customer("Krish","krish@gmail.com","9123456785","Pondicherry","ICICI"));


		customerService.addCustomer(new Customer("Mohit","mohit@gmail.com","9123456785","Goa","HSBC"));
		customerService.addCustomer(new Customer("Pranay","pranay@gmail.com","9123456785","Madras","HSBC"));
		customerService.addCustomer(new Customer("Saatvik","saatvik@gmail.com","9123456785","Bihar","HSBC"));
		customerService.addCustomer(new Customer("Samar","samar@gmail.com","9123456785","Punjab","HSBC"));
		customerService.addCustomer(new Customer("Ujjwal","ujjawal@gmail.com","9123456785","Rajasthan","HSBC"));

	}
}