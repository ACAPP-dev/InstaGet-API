package com.instaget.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instaget.customer.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	public List<Customer> findAll();
	
	public Customer save(Customer customer);
}
