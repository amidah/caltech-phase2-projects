import java.util.Date;

/*
 * Object - Multivalue Container (Homo - Same Types / Hetro - Diff Types)
 * Class - Textual Representation of an Object. It is also known as blueprint or template for creating objects
 * 
 * Priniciple of OOPS-
 * Identify the Object and write the attributes associated to it
 * Create a Class that will define the Object
 * From the Class we can create the real Object in the memory 
 * */

/*
 * 1 . We have identified the Object to be created and lets write the attributes associated
 * with user - name, phone, email, gender, birthDate, password
 * 2. Create the class that defines the User Object
 */
class User{
	// non-parameterized constructor to give default values to User attributes
	User(){
		name = "Bob";
		phone = "+91-999999999";
		email = "bob@example.com";
		gender = "Male";
		birthDate = new Date();
		password = "Bob@1234";
	}
	
	// paramterized constructor
	public User(String name, String phone, String email, String gender, Date birthDate, String password) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}

	
	
	// attributes - properties of Object
	String name;
	String phone;
	String email;
	String gender;
	Date birthDate;
	String password;
	
}



public class OOPS {


	public static void main(String[] args) {
		// from the User class, lets create the real Objects in the memory
		User user1 = new User();
		User user2 = new User();
		
		System.out.println("User 1: " + user1);
		System.out.println("User 2: " + user2);
		
		User user3 = user1; // Reference Copy Operation
		System.out.println("User 3: " + user3);
		
		// Lets perform write/update operation or set operation on both the user objects
		user1.name = "John"; // here it sets the name for both user 1 and user 3 references
		user2.name = "Alice";
		user3.name = "Charlie"; // here it updates the name for both user 1 and user 3 references
		
		user1.email = "charlie@gmail.com";
		user1.phone = "+91-9876543210";
		user1.gender = "Male";
		user1.birthDate = new Date();
		user1.password = "Charlie@1234";
		
		user2.email = "alice@gmail.com";
		user2.phone = "+91-9876543211";
		user2.gender = "Female";
		user2.birthDate = new Date();
		user2.password = "Alice@1234";
		
		user3 = new User(); // reassigns a new object to user 3 reference
		
		User user4 = new User("James", "+91-9876543219", "james@yahoo.com", "Male", new Date(), "James@1234"); // here we are initializing all the values of all attributes within a parameterized constructor during object creation
		

		System.out.println("Reading Data from User 1:");
		System.out.println(user1.name + " with dob " + user1.birthDate + " can be called at " + user1.phone + " and can be emailed at " + user1.email);
		
		System.out.println("Reading Data from User 2:");
		System.out.println(user2.name + " with dob " + user2.birthDate + " can be called at " + user2.phone + " and can be emailed at " + user2.email);
		
		System.out.println("Reading Data from User 3:");
		System.out.println(user3.name + " with dob " + user3.birthDate + " can be called at " + user3.phone + " and can be emailed at " + user3.email);
		
		System.out.println("Reading Data from User 4:");
		System.out.println(user4.name + " with dob " + user4.birthDate + " can be called at " + user4.phone + " and can be emailed at " + user4.email);
	
		// Delete the data - Automatically through Garbage Collection Process
		System.gc();
	}

}
