class Employee{
	
	static int objectSerialNo = 0;
	
	String name;
	String email;
	String phone;
	
	
	Employee(){
		objectSerialNo++;
		name = "";
		email = "";
		phone = "";
		// here this is a reference variable that holds the memory address of the current object. It always refers
		// to whichever object is cureently in action
		System.out.println("Employee Object Is Constructed with Serial no: " + objectSerialNo + " this is: " + this);
	}
	
	Employee(String name){
		if(name.isEmpty()) {
			this.name = "NA";
		}
		else {
			this.name = name;
		}
		System.out.println("inside employee single param constructor");
	}
	
	Employee(String name, String email, String phone){
		this(name); // here we are calling Employee(String name) constructor, it must be the first line in this constructor
		this.phone = phone;
		this.email = email;
		System.out.println("inside employee 3 param constructor");
	}
	
	void show() {
		System.out.println("Employee Details: " + name + " " + email + " " + phone);
	}
}



public class ThisKeyword {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", "john@gmail.com", "+919876543210");
		emp1.show();
		
//		Employee emp2 = new Employee();
//		System.out.println("Employee 2: " + emp2);
	}

}
