package com.simplilearn.oops;

class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 50;
		System.out.println("Cab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Cab booked from: " + from + " to: " + to + " with base fare: " + baseFare);
	}
}

// let's define the hierarchy
class MiniCab extends Cab{
	
	boolean isStreamingAvailable;
	
	MiniCab(){
		baseFare += 30;
		isStreamingAvailable = true;
		System.out.println("MiniCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Mini Cab booked from: " + from + " to: " + to + " location. Please pay: " + baseFare);
		if(isStreamingAvailable) {
		System.out.println("On the way you can stream the videos on the tab placed in front of you.");
		}
	}
}

class SharedCab extends Cab{
	
	int noOfPeople;
	
	SharedCab(){
		baseFare -= 20;
		noOfPeople = 4;
		System.out.println("SharedCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Shared Cab booked from: " + from + " to: " + to + " location. Please pay: " + baseFare);
		System.out.println("On the way you will share the cab with " + noOfPeople + " passengers.");
		
	}
}

class LuxuryCab extends Cab{
	int softDrinks;
	int chips;
	
	LuxuryCab(){
		baseFare += 50;
		softDrinks = 5;
		chips = 5;
		System.out.println("LuxuryCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Luxury Cab booked from: " + from + " to: " + to + " location. Please pay: " + baseFare);
		System.out.println("On the way you can use soft drinks and chips from the given number of " + softDrinks + " soft drinks and " + chips + " chips.");	
	}
}

class CarBookingApp{
	
	static Cab book(int type) {
		Cab cab = null;
		if(type == 1) {
			cab = new MiniCab();
		}
		else if(type == 2) {
			cab = new SharedCab();
		}
		else if(type == 3) {
			cab = new LuxuryCab();
		}
		else {
			System.out.println("Invalid Selection ...");
		}
		return cab;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
//		Cab cab;
//		cab = new Cab();
//		cab.bookCab("home", "work");
		
//		cab = new MiniCab();
//		cab.bookCab("home", "work");
//		
//		cab = new SharedCab();
//		cab.bookCab("home", "work");
//		
//		cab = new LuxuryCab();
//		cab.bookCab("home", "work");
		
		Cab cab = CarBookingApp.book(3);
		cab.bookCab("home", "work");
		
	}
	

}
