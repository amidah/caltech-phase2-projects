package com.simplilearn.oops;

abstract class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 50;
		System.out.println("Cab Object Constructed...");
	}
	
	abstract void bookCab(String from, String to);
//	{
//		System.out.println("Cab booked from: " + from + " to: " + to + " with base fare: " + baseFare);
//	}
	
	// non-abstract method
	void display() {
		System.out.println("I am a Cab class");
	}
}

class MiniCab extends Cab{
	
	boolean isStreamingAvailable;
	
	MiniCab(){
		baseFare += 30;
		isStreamingAvailable = true;
		System.out.println("MiniCab Object Constructed...");
	}

	@Override
	void bookCab(String from, String to) {
		System.out.println("Mini Cab booked from: " + from + " to: " + to + " location. Please pay: " + baseFare);
		if(isStreamingAvailable) {
		System.out.println("On the way you can stream the videos on the tab placed in front of you.");
		}
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Cab cab; // cab is not an object, its just a reference variable
		//cab = new Cab();// as my Cab class is abstract now, I can't create an object of it
		//cab.bookCab("home", "work");
		
		cab = new MiniCab();
		cab.bookCab("home", "work");

	}

}
