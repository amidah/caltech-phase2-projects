package com.example.mogodb.MongoDBIntegration;

import java.util.Iterator;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String mongodbURI = "mongodb+srv://amitdahiyaj:amit1234@mongocluster.q5sx95l.mongodb.net/?retryWrites=true&w=majority&appName=MongoCluster";
    
        try {
        	MongoClient client = MongoClients.create(mongodbURI);	
        	System.out.println("Connection created successfully...");
        	
        	System.out.println("List Database Names:");
        	Iterator itr = client.listDatabaseNames().iterator();
        	while(itr.hasNext()) {
        		System.out.println(itr.next().toString());
        	}
        	
        	MongoDatabase md = client.getDatabase("estore");
        	System.out.println("List Collection Names:");
        	Iterator itr1 = md.listCollectionNames().iterator();
        	while(itr1.hasNext()) {
        		System.out.println(itr1.next().toString());
        	}
        	
        }
        catch(Exception e) {
        	System.out.println("Something went wrong...");
        	System.out.println("Message: " + e.getMessage());
        }
    }
}
