package com.bank.reigister.customer.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.reigister.customer.entities.CustomerInfo;
import com.bank.reigister.customer.services.CustomerRgistrationService;

@RestController
@RequestMapping("/customerregister")
public class CustomerRegisterController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerRegisterController.class);
	
	@Autowired
	CustomerRgistrationService customerService;
	
	@PostMapping("/")
	public CustomerInfo registerCustomer(@Valid @RequestBody CustomerInfo customer){
		log.debug("Customer Registration process started..."+customer.getAddress());
		return customerService.customerReg(customer);
	}
	
	@PostMapping("/{firstname}")
	public List<String> getCredentialsForCustomer(@PathVariable String firstname) {
		log.debug("getting credentials for customer  "+firstname);
		return customerService.getCredentialsForCustomer(firstname);
	}
}
