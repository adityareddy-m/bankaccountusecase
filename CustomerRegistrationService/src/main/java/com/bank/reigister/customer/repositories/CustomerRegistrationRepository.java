package com.bank.reigister.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.reigister.customer.entities.CustomerInfo;


@Repository
public interface CustomerRegistrationRepository extends JpaRepository<CustomerInfo, Integer> {
		
	CustomerInfo findByfirstname(String name);
	CustomerInfo findByusername(String username);
	
}
