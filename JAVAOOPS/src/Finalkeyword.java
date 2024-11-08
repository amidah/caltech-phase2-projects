
// final classes can't be inherited
final class PaymentGateway{
	
	// with final keyword this method becomes read only
	final void pay(int amount) {
		System.out.println("Payment Gateway Transaction Successfull with amount " + amount);
	}
}

// child class can't inherit the final parent class
class MyPaymentGateway{ //extends PaymentGateway{
	
	// as the parent class pay method is read only due to final keyword, we can't override it here in child class
//	void pay(int amount) {
//		
//		// here in my child class I am manipulating, or controlling the behavior of pay method 
//		
//		System.out.println("My Payment Gateway Transaction is Successfull with amount " + amount);
//	}
}


public class Finalkeyword {

	public static void main(String[] args) {
		
		int age = 20; // a regular variable
		
		System.out.println(age);

		age = 40;// here we have modified the value
		
		System.out.println(age);
		
		final int score = 90; // a regular variable but it is a read only variable
		
		System.out.println(score);
		
		//score = 100; // we can't modify the value because it is final
		
		String name; // here we have created an empty variable, which has not been initialized yet
		name = "John"; // here we are initializing it with a value
		System.out.println(name);
		
		name = "Roy"; // here we are reassigning the value again
		System.out.println(name);
		
		final String petName; // blank final variable which has not been initialized yet
		petName = "Ronny"; // here the final variable gets its first and last value :)
		System.out.println(petName);
		
		//petName = "Bruno"; // not possible to reassign another value to a final variable
		
	}
	

}
