package com.instaget.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instaget.customer.model.Customer;
import com.instaget.customer.service.CustomerService;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("")
	Customer createAccount(@RequestBody Customer customer) throws SQLException {
		return customerService.createCustomer(customer);
	}

	@GetMapping("")
	List<Customer> getAllCustomers() {
		return customerService.getCustomers();
	}
}
