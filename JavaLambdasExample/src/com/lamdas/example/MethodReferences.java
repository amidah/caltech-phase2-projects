package com.lamdas.example;

@FunctionalInterface
interface Registration{
	void register();
}


interface Login{
	void login(String email, String password);
}

interface Taxes{
	double amountToPay(double amount);
	
}

class Authentication{
	
	static void registerUser(){
		System.out.println("[Authentication] Registering the user ...");
	}
	
	void loginUser(String email, String password) {
		if(email.equals("admin@gmail.com") && password.equals("admin1234")) {
			System.out.println("Login Successfull!");
		}
		else {
			System.out.println("Login Failure!");
		}
	}
	
	double getFinalAmount(double amount) {
		return amount + (0.18 * amount);
	}
}

public class MethodReferences {

	public static void main(String[] args) {
		
		// here we have used lambda expression for defining the bodu of register function 
		// in Registration functional interface  
		Registration registration = () -> {
			System.out.println("[Registration] Registering the user ...");
		};
		
		registration.register();
		
		// Now, lets replace the lambda expression with static method reference 
		// using method reference operator(::)
		Registration registration2 = Authentication::registerUser;
		registration2.register();
		
		//Login loginRef = Authentication::loginUser;
		Authentication authentication = new Authentication();
		
		Login loginRef = authentication::loginUser;
		loginRef.login("admin@gmail.com", "admin1234");
		
		
		Taxes taxes = authentication::getFinalAmount;
		double finalAmt = taxes.amountToPay(100);
		System.out.println("Final Amount to be paid: " + finalAmt);
	}

}
