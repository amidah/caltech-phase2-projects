package com.exception.handling;

import java.util.Scanner;

public class CashbackExceptionHandling {

	public static void main(String[] args) {
		
		int[] cashbacks = {100, 20, 30, 80, 90, 66, 75, 45, 25};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your lucky number: ");
		int luckyNumber = scanner.nextInt();
		scanner.close();
		int cashbackEarned = 0;
		try {
		cashbackEarned = cashbacks[luckyNumber];
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("The exception ocurred is: " + ae);
		}
		finally {
			System.out.println("Inside the finally block.");
			if(cashbackEarned == 0) {
			System.out.println("The entered lucky number: " + luckyNumber + " doesnot exists.");
			}
		}
		
		System.out.println("Thank you for your participation. You have earned a cashback of $" + cashbackEarned + ".");
		
		System.out.println("Cashback App Finished.");
	}

}
