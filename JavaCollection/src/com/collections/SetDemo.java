package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// ArrayList can have duplicate records
		// ArrayList maintains insertion order
//		 ArrayList<String> emails = new ArrayList<String>();
		
		
		// Hashset ensures uniqueness and doesnot maintain the insertion order
		// Hashset doesnot support indexing, so individual records can't be accessed
		HashSet<String> emails = new HashSet<String>();
 		emails.add("john@gmail.com");
		emails.add("jennie@yahoo.com");
		emails.add("leo@gmail.com");
		emails.add("mike@yahoo.com");
		emails.add("roy@yahoo.com");
		emails.add("sam@gmail.com");
		emails.add("jennie@yahoo.com");
		
		System.out.println(emails);
		
//		for(int i = 0; i < emails.size(); i++) {
//			System.out.println(emails.get(i));
//		}
		
		Iterator<String> itr = emails.iterator();
		while(itr.hasNext()) {
			String email = itr.next();
			System.out.println(email);
		}
		
		

	}

}
