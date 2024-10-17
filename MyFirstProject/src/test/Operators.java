package test;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		// +, -, *, /, %
		
		int a = 20;
		int b = 10;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		
		String c = "10";
		System.out.println("a + c = " + (a + c));
		
		// Arithmetic operations are not allowed for below operators
//		System.out.println("a - c = " + (a - c));
//		System.out.println("a * c = " + (a * c));
//		System.out.println("a / c = " + (a / c));
//		System.out.println("a % c = " + (a % c));
		
	    // Comparison Operators
		// >, <, >=, <=, ==, !=
		
		a = 30;
		b = 30;
		System.out.println("a > b = " + (a > b)); //F
		System.out.println("a < b = " + (a < b)); //F
		System.out.println("a >= b = " + (a >= b)); //T
		System.out.println("a <= b = " + (a <= b)); //T
		System.out.println("a == b = " + (a == b)); //T
		System.out.println("a != b = " + (a != b)); //F
		
		// We can compare an int with a string
//		a = 30;
//		String c = "30";
//		
//		System.out.println("a > c = " + (a > c)); 
//		System.out.println("a < c = " + (a < c)); 
//		System.out.println("a >= c = " + (a >= c)); 
//		System.out.println("a <= c = " + (a <= c)); 
//		System.out.println("a == c = " + (a == c)); 
//		System.out.println("a != c = " + (a != c)); 
		
		
		// Logical Operators
		// AND - &&, OR - ||, NOT - !
		a = 40; // here = is an assignment operator
		b = 40;
		System.out.println("(a == b) && (a > b) = " + ((a == b) && (a > b))); // F
		System.out.println("(a == b) || (a > b) = " + ((a == b) || (a > b))); // T
		System.out.println("!((a == b) && (a > b)) = " + !((a == b) && (a > b))); // T
		
		// Unary Operators
		// ++(increment - increase by 1), --(decrement - decrease by 1)
		// ~, !
		
		a = 22;
		
		System.out.println("a++ = " + a++); // post increment 22
		System.out.println("a-- = " + a--); // post decrement 23
		System.out.println("++a = " + ++a); // pre increment 23
		System.out.println("--a = " + --a); // pre decrement 22
		
		
		a = 22;
		b = -22;
		
		System.out.println("~a = " + ~a); // minus of total positive value starting from 0
		System.out.println("~b = " + ~b); // positive of total minus, starts from 1
		
		boolean e = false;
		boolean f = true;
		
		System.out.println("!e = " + !e);
		System.out.println("!f = " + !f);
		
		
		
		
		
		
		
		
		
 		
		
		
		
		
	}
}
