package test;

public class Conditionals {
	
	public static void main(String[] args) {
		
		// if-else statement
		
		int number = 0;
		
		if(number > 0) {
			System.out.println("The number is positive");
		}
		else if(number < 0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("It is zero");
		}
		
		
		int age = 15;
		int weight = 51;
		
		if(age >= 18) { // parent if
			if(weight > 50) { // nested child if
				System.out.println("You are eligible for Boxing Championship!");
			}
			else {
				System.out.println("You are not eligible for Boxing Championship!");
			}
		}
		else {
			System.out.println("Age must be greater than 18!");
		}
		
		// switch case statement
		number  = 500;
		
		switch(number) {
			// Case Statements
		case 100:
			System.out.println("Number is 100");
			break;
		case 200:
			System.out.println("Number is 200");
			break;
		case 300:
			System.out.println("Number is 300");
			break;
		case 400:
			System.out.println("Number is 400");
			break;
		default:
			System.out.println("Number doesn't match");
		}
		
	}

	
}
