package com.instaget.customer.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instaget.customer.dao.CustomerDao;
import com.instaget.customer.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public Customer createCustomer(Customer customer) throws SQLException {
		return customerDao.save(customer);
	}
	
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}
}
