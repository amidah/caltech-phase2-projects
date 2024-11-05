// Multi Level Inheritance - A is extended by B, and B is extended by C
class A{
	int age = 10;
	String name = "John";
	
	A(){
		System.out.println("A object is constructed...");
	}
	
	void printDetails() {
		System.out.println(name + " : " + age);
	}
}

class B extends A{
	int age = 20;
	String name = "Sam";
	
	B(){
		System.out.println("B object is constructed...");
	}
	
	void printDetails() {
		super.printDetails();
		System.out.println(name + " : " + age);
	}
	
}

class C extends B{
	int age = 30;
	String name = "Roy";
	
	C(){
		System.out.println("C object is constructed...");
	}
	
	void printDetails() {
		super.printDetails();
		System.out.println(name + " : " + age);
	}
}


// Mutiple Innheritance is not allowed in Java with classes
//class P{
//	void details() {
//		System.out.println("P details");
//	}
//}
//
//class Q{
//	void details(){
//		System.out.println("Q details");
//	}
//}
//
//class R extends P, Q{
//	
//}



public class InheritanceTypes {

	public static void main(String[] args) {
//		A a = new A();
//		a.printDetails();
//		
//		B b = new B();
//		b.printDetails();
		
		C c  = new C();
		c.printDetails();
		
		
	}
}
