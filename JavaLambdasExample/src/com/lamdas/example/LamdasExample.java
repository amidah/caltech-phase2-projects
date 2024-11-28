package com.lamdas.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LamdasExample {
	
	public static void main(String[] args) {
		
		List<String> emails = new ArrayList<String>();
		emails.add("john@gmail.com");
		emails.add("sam@gmail.com");
		emails.add("roy@yahoo.com");
		emails.add("mike@outlook.com");
		
		String csvData = null;
		List<String> emailList = Arrays.asList("john@gmail.com", "sam@gmail.com", "roy@yahoo.com", "mike@utlook.com");
		
//		System.out.println(emails);
//		System.out.println(emailList);
		
		csvData = emails.stream().map((String email) -> email.replace("yahoo.com", "google.com")).collect(Collectors.joining(","));
		
		emails = emails.stream().map((String email) -> email.replace("yahoo.com", "google.com")).collect(Collectors.toList());
		//emails.stream() - converts the list of emails to a stream for processing
		// map((String email) -> email.replace("yahoo.com", "google.com")) - replaces the domian yahoo.com with google.com in each element present inside the list
		// collect(Collectors.joining(",")) - it collects the modified emails into a single comma separated string
		// (String email) -> email.replace("yahoo.com", "google.com") - this entire expression is a lambda expression, 
		// it actually defines an anonymous function that takes String email as an input and returns the modified version of that String.
		// '->' it is a lambda operator, it separates the paramaters from the method body 
		System.out.println(csvData);
		System.out.println(emails);
		
		
		
		
		
		
		
		
		
	}

}
