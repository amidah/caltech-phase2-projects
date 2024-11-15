package com.exception.handling;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int b = 0;
		
		List<Integer> numList = new ArrayList<Integer>();

		numList.add(2);
		numList.add(3);
		numList.add(0);
		numList.add(4);
		numList.add(6);
		try{
		for(Integer i : numList) {
			System.out.println("Dividing by i: " + i);
			b = 24/i;
			System.out.println("Value of b: " + b);
		}
		}
		catch(ArithmeticException ae) {
			System.out.println("Division by zero");
			b = 0;
			System.out.println(ae);
		}
		finally {
			System.out.println("Inside the finally block");
		}
		
		System.out.println("After the for loop.");
		System.out.println("After the for loop.");
		System.out.println("After the for loop.");
		System.out.println("After the for loop.");
		System.out.println("After the for loop.");
		System.out.println("After the for loop.");
	}

}
