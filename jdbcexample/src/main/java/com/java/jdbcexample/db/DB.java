package com.java.jdbcexample.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.java.jdbcexample.model.Customer;

public class DB implements DAO {

	Connection connection;
	Statement statement;

	public DB() {
		try {
			// 1. Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("The driver class is loaded");
		} catch (Exception e) {
			System.out.println("Exception Occurred while loading the driver: " + e);
		}

	}

	public void createConnection() {

		try {
			String user = "root";
			String password = "Root@1234";
			String url = "jdbc:mysql://localhost/estore";
			// 2. Creating a connection
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");
		} catch (Exception e) {
			System.out.println("Exception Occurred while creating a connection: " + e);
		}

	}

	public void closeConnection() {

		try {
			connection.close();
			System.out.println("Connection is closed now.");
		} catch (SQLException e) {
			System.out.println("Exception Occurred while closing a connection: " + e);
		}

	}

	public void createCustomer(Customer customer) {

		try {

			String sql = "insert into Customer values(null, '" + customer.getName() + "', '" + customer.getPhone()
					+ "', '" + customer.getEmail() + "', '" + customer.getBirthDate() + "', " + customer.getAge()
					+ ", '" + customer.getRegisteredOn() + "', " + customer.getTemperature() + ")";

			System.out.println("Insert Customer Sql Query: " + sql);

			// 3. Creating a statement from connection object
			statement = connection.createStatement();

			// 4. Calling the executeUpdate function using statement object, to execute the
			// sql query
			int result = statement.executeUpdate(sql);

			if (result > 0) {
				System.out.println("Customer created successfully.");
			} else {
				System.out.println("Customer not created.");
			}
		} catch (SQLException e) {
			System.out.println("Exception Occurred while creating a customer: " + e);
		}
	}

	public void updateCustomer(Customer customer) {

		try {

			String sql = "UPDATE Customer set name = '" + customer.getName() + "', phone = '" + customer.getPhone() + "', email = '" + customer.getEmail()
					+ "' where cid = " + customer.getCid();
			System.out.println("Update Customer Query: " + sql);

			// 3. Creating a statement from connection object
			statement = connection.createStatement();

			// 4. Calling the executeUpdate function using statement object, to execute the
			// sql query
			int result = statement.executeUpdate(sql);

			if (result > 0) {
				System.out.println("Customer updated successfully.");
			} else {
				System.out.println("Customer not updated.");
			}
		} catch (SQLException e) {
			System.out.println("Exception Occurred while updating a customer: " + e);
		}

	}

	public ArrayList<Customer> getAllCustomers() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			String sql = "SELECT * FROM Customer";
			statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				Customer customer1 = new Customer();
				customer1.setCid(resultSet.getInt(1));
				customer1.setName(resultSet.getString(2));
				customer1.setPhone(resultSet.getString(3));
				customer1.setEmail(resultSet.getString(4));
				customer1.setBirthDate(resultSet.getString(5));
				customer1.setAge(resultSet.getInt(6));
				customer1.setRegisteredOn(resultSet.getString(7));
				customer1.setTemperature(resultSet.getFloat(8));
				
				customers.add(customer1);
			}	
		}
		catch(Exception e) {
			System.out.println("Exception Occurred while getting the customers: " + e);
		}
		
		return customers;
	}

	public void deleteCustomer(int cid) {	
		try {

			String sql = "DELETE FROM Customer where cid = " + cid;
			System.out.println("Delete Customer Query: " + sql);

			// 3. Creating a statement from connection object
			statement = connection.createStatement();

			// 4. Calling the executeUpdate function using statement object, to execute the
			// sql query
			int result = statement.executeUpdate(sql);

			if (result > 0) {
				System.out.println("Customer deleted successfully.");
			} else {
				System.out.println("Customer not deleted.");
			}
		} catch (SQLException e) {
			System.out.println("Exception Occurred while deleting a customer: " + e);
		}
		
	}
}
