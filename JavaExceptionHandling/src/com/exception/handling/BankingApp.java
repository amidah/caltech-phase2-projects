package com.exception.handling;

class BankAccount{
	
	int balance;
	int minBalance;
	int attempts = 0;
	
	public BankAccount() {
		balance = 10000;
		minBalance = 2000;
	}
	
	void withdraw(int amount) throws BankingException {
		balance -= amount;
		
		if(balance < minBalance) {
			balance += amount;
			System.out.println("Withdrawal Failed. Please deposit more money for transaction. Balance is low: " + balance);
			attempts++;
		}
		else {
			System.out.println("Withdrawal Successfull. New balance is " + balance);
		}
		
		if(attempts == 3) {
			BankingException be = new BankingException("Max Attempts allowed: " + attempts);
			throw be;
		}
	}
}

// Checked Custom Exception
class BankingException extends Exception{
	
	public BankingException(String message) {
		super(message);
	}
}

public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking Started.");
		
		BankAccount johnAcc = new BankAccount();
		try {
			for(int i = 0; i < 5000; i++) {		
				johnAcc.withdraw(3000);
			}
		}
		catch (BankingException e) {
				
				System.out.println("Exception is: " + e);
			}
		
		System.out.println("Banking Stopped.");

	}

}
