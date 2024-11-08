package com.simplilearn.oops;

abstract class PayTmPaymentGateway{
	private boolean isBankInterfaceUp = false;
	PayTmPaymentGateway(){
		System.out.println("[PayTm] PayTmPaymentGateway object is constructed.");
	}
	void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[PayTm] Payment successfully done for amount of " + amount);
			onSuccess("[PayTm] 101 - Payment Success");
		}
		else {
			System.out.println("[PayTm] Payment Failed. Please try again later.");
			onFailure("[PayTm] 201 - Payment Failure");
		}
	}
	abstract void onSuccess(String message);
	abstract void onFailure(String message);
}

interface GooglePay{
	
	void googlePay(int amount);
}

interface RazorPay{
	void razorPay(int amount);
}

interface PayPal{
	void paypalPay(int amount);
}

class EstorePayment extends PayTmPaymentGateway implements GooglePay, RazorPay, PayPal{
	EstorePayment(){
		System.out.println("[Estore] EstorePayment is constructed.");
	}	
	@Override
	void onSuccess(String message) {
		System.out.println("[Estore] " + message);
		System.out.println("[Estore] Thank you for placing an order. It shall be dispatched soon.");
	}
	@Override
	void onFailure(String message) {
		System.out.println("[Estore] " + message);
		System.out.println("[Estore] Something went wrong. Please try again later :(");	
	}
	@Override
	public void paypalPay(int amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void razorPay(int amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void googlePay(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class PaymentApp {
	
	public static void main(String[] args) {
		
		// Not allowed - as we can't create an object of an abstract class
		//PayTmPaymentGateway paytm = new PayTmPaymentGateway();
		
		EstorePayment estorePayment = new EstorePayment();
		estorePayment.pay(3000);
}
	
}
