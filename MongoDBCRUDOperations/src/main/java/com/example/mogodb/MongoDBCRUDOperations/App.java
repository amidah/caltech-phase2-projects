package com.example.mogodb.MongoDBCRUDOperations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.mogodb.MongoDBCRUDOperations.dao.DBOperations;
import com.example.mogodb.MongoDBCRUDOperations.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "MongoDB Crud Operations App" );
        
        DBOperations dbOperations = new DBOperations();
        
        // Insert One Customer
        
//        Customer customer = new Customer("John", "+91-9876543211", "john@gmail.com", 98.4f, new Date(), new Date());
//        System.out.println("Customer Details:");
//        System.out.println(customer);
//        dbOperations.insertCustomer(customer);
//        
        
        // Insert Multiple Customers
        
//        Customer customer1 = new Customer("Roy", "+91-9876543212", "roy@gmail.com", 98.4f, new Date(), new Date());
//        Customer customer2 = new Customer("Celina", "+91-9876543213", "celina@gmail.com", 98.4f, new Date(), new Date());
//        Customer customer3 = new Customer("Mike", "+91-9876543214", "mike@gmail.com", 98.4f, new Date(), new Date());
//        Customer customer4 = new Customer("Robert", "+91-9876543215", "robert@gmail.com", 98.4f, new Date(), new Date());
//        Customer customer5 = new Customer("Michael", "+91-9876543216", "michael@gmail.com", 98.4f, new Date(), new Date());
//        
//        List<Customer> customers = new ArrayList<Customer>();
//        customers.add(customer1);
//        customers.add(customer2);
//        customers.add(customer3);
//        customers.add(customer4);
//        customers.add(customer5);
//        dbOperations.insertCustomers(customers);
//        
        
        // Get All the Customers
        dbOperations.getAllCustomers();
        
        // Get Customer By Email
        dbOperations.getCustomerByEmail("sam@gmail.com");
        
        // Update Customer By Email
//        dbOperations.updateCustomer("sam@gmail.com", "age", "30");

        // Delete Customer By Email
        dbOperations.deleteCustomer("roy@gmail.com");
        
        
        
    }
}
