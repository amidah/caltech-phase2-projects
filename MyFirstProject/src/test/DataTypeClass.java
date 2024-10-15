package test;

public class DataTypeClass {
	
	byte a = 120;
	short b = 10000;
	int c = 1000000;
	long d = 100000000;
	float e = 12345.12345f;
	double f = 12345.12345;
	char g = 'a';
	boolean h = true;
	
	public static void main(String[] args) {
		
		DataTypeClass dt = new DataTypeClass(); // here we have created this class object
		dt.printDataTypeValues(); // so as to call a non-static function from static function
		
	}
	
	void printDataTypeValues() {
		
		
		System.out.println("byte: "+ a);
		System.out.println("short: " + b);
		System.out.println("int: " + c);
		System.out.println("long: " + d);
		System.out.println("float: " + e);
		System.out.println("double: " + f);
		System.out.println("char: " + g);
		System.out.println("boolean: " + h);
	}
	
}
