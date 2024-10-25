package test;

// Method Overloading - Compile Time Polymorphism
public class Overloading {

//	Rules to follow Overloading:
//	1. Method name should be same
//	2. Unique parameter list - different number of parameters
//	3. Unique parameter list - same number but different type of parameters
//	4. Change sequence of parameters
//	5. Different return types won't be treated as a valid rule
	
	public static void main(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(50.50, 40.50);
		add(20.50, 10);
		add(20, 10.50);
	}
	
	static void add(int num1, int num2) {
		System.out.println("int num1 + int num2 = " + (num1 + num2));
	} 
	
	static void add(int num1, int num2, int num3) {
		System.out.println("int num1 + int num2 + int num3 = " + (num1 + num2 + num3));
	}
	
	static void add(double num1, double num2) {
		System.out.println("double num1 + double num2 = " + (num1 + num2));
	}
	
	static void add(int num1, double num2) {
		System.out.println("int num1 + double num2 = " + (num1 + num2));
	}
	
	static void add(double num1, int num2) {
		System.out.println("double num1 + int num2 = " + (num1 + num2));
	}
	
	/*
	 * not allowed because only return type differs
	 */
	
//    int add(double num1, int num2) {
//		
//	}
	
}
