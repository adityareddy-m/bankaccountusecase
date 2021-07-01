package com.bank.reigister.customer.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.reigister.customer.controllers.CustomerRegisterController;
import com.bank.reigister.customer.entities.CustomerInfo;
import com.bank.reigister.customer.entities.LoginCredentials;
import com.bank.reigister.customer.repositories.CustomerRegistrationRepository;

@Service
public class CustomerRgistrationService {
	
	
	private static final Logger log = LoggerFactory.getLogger(CustomerRegisterController.class);
	
	@Autowired
	CustomerRegistrationRepository customerRepos;
		
	public CustomerInfo customerReg(CustomerInfo customer) {
		log.info("in service "+customer.getAddress());;
		return customerRepos.save(customer);
	}
	
	public Optional<CustomerInfo> isCustomerRegSuccess(Integer id) {
		return customerRepos.findById(id);
		
	}
	
	public List<String> getCredentialsForCustomer(String firstname) {
		CustomerInfo customer = customerRepos.findByfirstname(firstname);
		List<String> creds = new ArrayList<String>();
		
		customer.setUsername(customer.getFirstname());
		customer.setPassword(customer.getId()+"ABCD");
		customerRepos.save(customer);
		
		creds.add(customer.getFirstname());
		creds.add(customer.getId()+"ABCD");
		
		return creds;
	}
	
	
	//public String getAccountNumber(LoginCredentials creds){
	
	public String getAccountNumber(String username, String password){
		
		//String userName = creds.getUsername();
		String accountNumber="";
		CustomerInfo customer =customerRepos.findByusername(username);
		
		if(customer.getUsername().equals(username)) {
			accountNumber = "Successfully Registered and your Account Number is : 293847561023";
		}
		return accountNumber;
		
	}
	
}
