package test;

class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class PassByValueReference {
	
	int num = 40;
	
	public static void main(String[] args) {
		
		int num = 10;
		
		String name = new String("John");
		
		Student student = new Student(1, "John");
		
		System.out.println("Before method call: " + num);
		System.out.println("Before method call: " + name);
		System.out.println("Before method call: " + student);
		
		modifyPrimitiveValue(num);
		modifyPredefinedNonPrimitiveValue(name);
		modifyCustomNonPrimitiveValue(student);
		
		System.out.println("After method call: " + num);
		System.out.println("After method call: " + name);
		System.out.println("After method call: " + student);
	}
	
	public static void modifyPrimitiveValue(int num) {	
		num = 20;		// here we are modifying the local copy not the original one
	}
	

	public static void modifyPredefinedNonPrimitiveValue(String name) {
		name = new String("Sam"); // here we are modifying the local copy not the original one
	}
	
	public static void modifyCustomNonPrimitiveValue(Student student) {
		
		//student = new Student(2, "Sam"); // here we are modifying the local copy not the original one
		student.id = 3;
		student.name = "Sam";
		System.out.println("inside modify function: " + student);
		
	}
}
