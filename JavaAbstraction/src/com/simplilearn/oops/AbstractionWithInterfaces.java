package com.simplilearn.oops;

// by default all the methods inside the interface are public and abstract
interface GooglePays{
	// non-abstract method
	default void payFromGoogle(int amount) {
		System.out.println("[GooglePay] Amount Paid: " + amount);
	}
	// abstract methods
	public abstract void onSuccess(int code, String message);	
	void onFailure(int code, String message);
}

interface ApplePay{
	// non-abstract method
	default void payFromApple(int amount) {
		System.out.println("[ApplePay] Amount Paid: " + amount);
	}
	// abstract methods
	void onSuccess(String message);
	void onFailure(String message);
}

class FoodDeliveryAppPayments implements GooglePays, ApplePay{
	@Override
	public void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment received. We will deliver the order soon..." + code + " " + message);
		
	}

	@Override
	public void onFailure(int code, String message) {
		System.out.println("[FDA] Payment failed. Please try again..." + code + " " + message);
		
	}

	@Override
	public void onSuccess(String message) {
		System.out.println("[FDA] Payment received. We will deliver the order soon..." + " " + message);
		
	}

	@Override
	public void onFailure(String message) {
		System.out.println("[FDA] Payment failed. Please try again..." + " " + message);
		
	}
	
}


public class AbstractionWithInterfaces {

	public static void main(String[] args) {
		
		GooglePays googleRef = new FoodDeliveryAppPayments();
		googleRef.payFromGoogle(3000);
		googleRef.onSuccess(200, "Order Delivered.");
		
		ApplePay appleRef = new FoodDeliveryAppPayments();
		appleRef.payFromApple(5000);
		appleRef.onSuccess("Order Delivered.");

	}

}
