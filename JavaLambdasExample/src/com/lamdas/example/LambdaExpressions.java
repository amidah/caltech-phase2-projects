package com.lamdas.example;

@FunctionalInterface
interface Register{
	void register();
	//void validate();
}

@FunctionalInterface
interface Login{
	void login(String email, String password);
}

//class User implements Register{
//
//	@Override
//	public void register() {
//		System.out.println("User registered");
//		
//	}
//	
//}



public class LambdaExpressions {

	public static void main(String[] args) {
		// general approach
//		Register register = new User();
//		register.register();
		
		// here we have used annonymous class to define the register method
//		Register register = new Register() {
//			
//			@Override
//			public void register() {
//				System.out.println("User registerd");
//				
//			}
//		};
//		
//		register.register();
		
		
		// here using the Lambda expression implementation for the functional
		//interface, providing the same output as before. Lambda expressions offer a simpler and
		//easier implementation compared to creating a class and using polymorphic statements
		Register register = () -> {
			System.out.println("User registered");
		};
		register.register();
		
		Login login = (String email, String password) -> {
			System.out.println("Connecting to DB");
			System.out.println("Validating user from DB");
			System.out.println("Thank you for logging in with email " + email);
		};
		
		
		login.login("john@gmail.com", "john@1234");

	}

}
