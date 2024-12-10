package com.java.jdbcexample;

import java.util.ArrayList;

import com.java.jdbcexample.db.DB;
import com.java.jdbcexample.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the MySQL Connection System" );
        
//        Customer customer = new Customer("Roy", "+91-9876543212", "roy@gmail.com", "01-06-1991", 33, "2024-12-06", 98.9f);
        
        Customer customer = new Customer();
        customer.setCid(1);
        customer.setName("John Watson");
        customer.setPhone("+91-9876543218");
        customer.setEmail("john.watson@yahoo.com");
        
        System.out.println("Connection to MySQL DB...");
        
        DB db = new DB();
        
        db.createConnection();
        
//        db.createCustomer(customer);
        
//        db.updateCustomer(customer);
        
//        ArrayList<Customer> customers = db.getAllCustomers();
//        System.out.println(customers);
        
        db.deleteCustomer(3);
        
        db.closeConnection();
    }
}
