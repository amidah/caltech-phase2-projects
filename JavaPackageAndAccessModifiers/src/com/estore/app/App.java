package com.estore.app;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello I am estore app");
		
		App app = new App();
		
		One one = new One();
		
		System.out.println(one.b);
		System.out.println(one.c);
		System.out.println(one.d);
		
		one.showDefault();
		one.showProtected();
		one.showPublic();

		
		Two two = new Two();
		System.out.println(two.b);
		System.out.println(two.c);
		System.out.println(two.d);
		
		two.showDefault();
		two.showProtected();
		two.showPublic();

	}

}
