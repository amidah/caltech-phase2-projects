package com.example.mogodb.MongoDBCRUDOperations.model;

import java.util.Date;

import org.bson.Document;

public class Customer {
	
	String name;
	String phone;
	String email;
	Float temperature;
	Date inTime;
	Date outTime;
	
	public Customer() {
		
	}

	public Customer(String name, String phone, String email, Float temperature, Date inTime, Date outTime) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.temperature = temperature;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", temperature=" + temperature
				+ ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
	
	public Document getDocument() {
		Document document = new Document();
		
		document.append("name", name);
		document.append("phone", phone);
		document.append("email", email);
		document.append("temperature", temperature);
		document.append("inTime", inTime);
		document.append("outTime", outTime);
	
		return document;
	}
	
	
	

}
