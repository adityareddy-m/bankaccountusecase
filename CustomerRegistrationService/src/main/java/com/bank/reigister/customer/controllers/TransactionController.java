package com.bank.reigister.customer.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.reigister.customer.services.CustomerRgistrationService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
		
	
	private static final Logger log = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	CustomerRgistrationService transactionService;
	
	@PostMapping("/")
	public ResponseEntity<?> moneyTransaction(@RequestParam(value="fromAccountNumber") String fromAccountNumber,@RequestParam(value="toAccountNumner") String toAccountNumner,
			@RequestParam(value="amount") String amount){
		
		log.debug("Transaction Initiated for the AccountNumber "+fromAccountNumber+" "+"To Account Number "+toAccountNumner+" with amount "+amount);
		
		String message = transactionService.transactionMoney(fromAccountNumber,toAccountNumner,amount);
		
		if(message.contains("Failed")) {
			return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<>(message,HttpStatus.OK);
		}
		
		
	}
}
