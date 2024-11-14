package com.simplilearn.oops.anonymous;

// all the method present inside the interface are by default abstract meaning they are without any body
interface Payment{
	
	// here default keyword helps to convert the by default abstract pay method to a non-abstract pay method
	default void pay(int amount) {
		
	}
		
}

interface PaymentCallbacks{
	void onSuccess(String message);
	void onFailure(String message);
}

class Payments implements PaymentCallbacks{

	@Override
	public void onSuccess(String message) {
		System.out.println("Payment Passed: " + message);
		
	}

	@Override
	public void onFailure(String message) {
		System.out.println("Payment Failed: " + message);
		
	}
	
}


public class AnonymousClass {

	public static void main(String[] args) {
		
//		PaymentCallbacks ref  =  new Payments();
//		ref.onSuccess("Amount paid 2000");
//		ref.onFailure("Amount 2000 not processed.");
		
//		PaymentCallbacks ref = new PaymentCallbacks(); - not allowed because we are trying to create an object of an interface
		
		// here we are not creating an object of Parents class, but we are directly creating an object using the
		// PaymentCallbacks interface
		// here new PaymentCallbacks can be considered as an Anonymous Class, meaning a Class with no name implementing
		// the PaymentCallbacks interface
		PaymentCallbacks ref = new PaymentCallbacks() {
			
			@Override
			public void onSuccess(String message) {
				System.out.println("Payment Passed: " + message);
				
			}
			
			@Override
			public void onFailure(String message) {
				System.out.println("Payment Failed: " + message);
				
			}
		};
		
		ref.onSuccess("Amount paid 2000");
		ref.onFailure("Amount 2000 not processed.");
	}
	
}
