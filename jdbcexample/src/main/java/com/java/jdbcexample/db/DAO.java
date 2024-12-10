package com.java.jdbcexample.db;

import java.util.ArrayList;

import com.java.jdbcexample.model.Customer;

public interface DAO {
	
	// here we will declare methods for CRUD Operations
	
	void createConnection();
	
	void closeConnection();
	
	void createCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	ArrayList<Customer> getAllCustomers();
	
	void deleteCustomer(int cid);
}
