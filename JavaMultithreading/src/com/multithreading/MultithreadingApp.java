package com.multithreading;

//class ReadingTask{ 
//	
//	void readPages(){
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("[PrintingTask] Reading Book Pages for Java. Page#" + i);
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

// Custom thread class can be created either by extending the predefined Thread class or by implementing the Runnable interface
class ReadingTask1 extends Thread{ // now my ReadingTask class is a thread class
	
	@Override
	public void run(){
		Thread.currentThread().setName("ReadingTask1Thread");
		System.out.println("ReadingTask1 Thread: " + Thread.currentThread().getName() + " started");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("[ReadingTask1] Reading Book Pages for Java. Page#" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ReadingTask1 Thread: " + Thread.currentThread().getName() + " finished");
	}
	
}

class ReadingTask2 implements Runnable{

	@Override
	public void run() {
		System.out.println("ReadingTask2 Thread: " + Thread.currentThread().getName() + " started");
		for(int i = 1; i <= 10; i++) {
			System.out.println("[ReadingTask2] Reading Book Pages for Python. Page#" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ReadingTask2 Thread: " + Thread.currentThread().getName() + " finished");
	}
	
}

public class MultithreadingApp {

	public static void main(String[] args) {
		System.out.println("Main Thread: " + Thread.currentThread().getName() + " Started.");
		
		ReadingTask1 readingTask1 = new ReadingTask1(); // ReadingTask is now a thread class
		readingTask1.start(); // here we can call start method to start our own thread
		
		Thread readingTask2 = new Thread(new ReadingTask2(), "ReadingTask2Thread"); // here we have created a predefined Thread class 
													  // object with a new custom thread class i.e. Readingtask2 object passed in the constructor
		
		readingTask2.start();
		
		System.out.println("Main Thread: " + Thread.currentThread().getName() + " Finished.");

	}

}
