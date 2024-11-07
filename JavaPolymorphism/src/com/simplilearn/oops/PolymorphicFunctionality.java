package com.simplilearn.oops;

class CA{
	void show() {
		System.out.println("This is my CA class.");
	}
}

class CB extends CA{
	void show() {
		System.out.println("This is my CB class.");
	}
	
	void hello() {
		System.out.println("Hello I am CB class.");
	}
}


public class PolymorphicFunctionality {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.show();
		
		CB cb = new CB();
		cb.show();
		cb.hello();
		
//		CA caRef = null;
//		caRef = new CB(); // Polymorphic Statement - parent ref can point to the child object, or can hold 
						  // the hash code of the child object
		
//		CB cbRef = null;
//		cbRef = new CA(); // Not possible - child ref can't point or hold the hash code of the parent
		
		CA caRef = new CB(); // Polymorphic Statement - parent ref can point to the child object, or can hold 
		  					 // the hash code of the child object
		
		
		caRef.show(); // here method overriding comes into the existence with the polymorphic statement,
					  // here show method is overriden by the child class
		//caRef.hello(); // here we can't execute the hello method using the parent's ref as this method 
					   // is not overriden by child
		
		CB cbRef = (CB)caRef; // here we are performing downcasting i.e. we are trying to 
							  // convert the type of the parent ref to the child ref
		
		cbRef.hello();
	}

}
