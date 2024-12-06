package com.example.mogodb.MongoDBCRUDOperations.dao;

import static com.example.mogodb.MongoDBCRUDOperations.util.Util.*;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.example.mogodb.MongoDBCRUDOperations.model.Customer;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;

public class DBOperations {
	
	MongoClient client;
	MongoDatabase mongoDatabase;
	MongoCollection mongoCollection;

	public DBOperations() {
		
		try {
			String connectionString = "mongodb+srv://amitdahiyaj:amit1234@mongocluster.q5sx95l.mongodb.net/?retryWrites=true&w=majority&appName=MongoCluster";
			client = MongoClients.create(connectionString);	
	    	System.out.println("[DBOperations] Connection created.");
	    	mongoDatabase = client.getDatabase(DB_NAME);
	    	System.out.println("[DBOperations] Database selected as estore.");
	    	mongoCollection = mongoDatabase.getCollection(COLLECTION_NAME);
	    	System.out.println("[DBOperations] Collection from estore selected as customers.");
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public void insertCustomer(Customer customer) {
		try {
			Document customerDoc = customer.getDocument();
			mongoCollection.insertOne(customerDoc);
			System.out.println("Customer inserted successfully.");
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	
	public void insertCustomers(List<Customer> customers) {
		try {
			List<Document> customerDocs = new ArrayList<Document>();
			
			for(Customer customer : customers) {
				customerDocs.add(customer.getDocument());
			}
			
			mongoCollection.insertMany(customerDocs);
			System.out.println("Customers inserted successfully.");
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public void getAllCustomers(){
		
		try {
			FindIterable fitr = mongoCollection.find();
			List<Document> customerDocs = (List<Document>) fitr.into(new ArrayList<Document>());
						
			for(Document doc : customerDocs) {
				System.out.println(doc.toJson());
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public void getCustomerByEmail(String email) {
		try {
			Document filter = new Document("email", email);
			
			Document customerDoc = (Document) mongoCollection.find(filter).first();
			System.out.println("\n");
			System.out.println(customerDoc.toJson());
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
	
	public void updateCustomer(String email, String key, String value){
		try {
			Bson filter = Filters.eq("email", email);
			Bson updateOperation = Updates.set(key, value);
			
			mongoCollection.updateOne(filter, updateOperation);
			
			System.out.println("\n");
			System.out.println("Document updated for email: " + email);
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}	
	}
	
	public void deleteCustomer(String email) {
		
		try
		{
			Bson filter = Filters.eq("email", email);
			
			DeleteResult deleteResult = mongoCollection.deleteOne(filter);
			
			if(deleteResult.getDeletedCount() > 0) {
				System.out.println("Document deleted for email: " + email);
			}
			else {
				System.out.println("Document not found");
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " + e);
		}	
		
	}
	
}


