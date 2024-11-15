package com.exception.handling;


// In Java, all the exceptions are the children of Exception Class
// Except the runtime exceptions in java, all the other exceptions are referred to as checked exceptions
// Here is the hierarchy
// Throwable
//    Exception
//       RuntimeException - they are also referred to as unchecked exceptions
//          - ArrayIndexOutOfBoundsException
//          - NullPointerException
//          - ArithmeticException
//       IOException - they are checked exceptions
//          - FileNotFoundException 
//       SQLException - - they are checked exceptions
//    Error

public class CustomException {

	public static void main(String[] args) throws InvalidPhoneNumberException {
		
		// here InterruptedException is also a checked exception because we can check it and apply try catch accordingly during compile time
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String phone = "+91-9876543210";
		String email = "abc@gmail.com";
		
		if(phone.isEmpty()) {
			InvalidPhoneNumberException ipn = new InvalidPhoneNumberException("Phone number can't be empty");
			throw ipn;
		}
		
		if(email.isEmpty()) {
			InvalidEmailException ien = new InvalidEmailException("Email can't be empty");
			throw ien;
		}
		
		

	}

}

// Checked Custom Exception 
class InvalidPhoneNumberException extends Exception{

	public InvalidPhoneNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

// Unchecked Custom Exception
class InvalidEmailException extends RuntimeException{
	
	public InvalidEmailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

