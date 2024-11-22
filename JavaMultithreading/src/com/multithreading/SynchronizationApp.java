package com.multithreading;

class Printer{
	
	String status = "Available";
	// synchronized method
//	synchronized void printDocument(String docName, int copies) {
		
	void printDocument(String docName, int copies) {
		
		status = "Busy";
		
		System.out.println("[Printer] Printing the document: " + docName);
		
		showPrinterStatus();
		
		for(int i = 1; i <= copies; i++) {
			System.out.println("[Printer] " + docName + " copy# " + i + "...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		status = "Available";
		showPrinterStatus();
	}
	
	void showPrinterStatus(){
		System.out.println("[Printer] Status: " + status + "\n");
	} 
}

class Laptop extends Thread{
	
	Printer pref;
	
	void  attachPrinter(Printer p) {
		pref= p ;
	}
	
	@Override
	public void run() {
		// synchronized block
		synchronized (pref) {
			pref.printDocument(">> John Resume.pdf <<", 10);
		}
		
	}
}

class Desktop extends Thread{
	
	Printer pref;
	
	void  attachPrinter(Printer p) {
		pref= p ;
	}
	
	@Override
	public void run() {
		
		synchronized (pref) {
			pref.printDocument(">> Sam Resume.pdf <<", 10);

		}
			
	}
}

public class SynchronizationApp {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
//		printer.showPrinterStatus();
//		printer.printDocument("LearningJava.pdf", 10);
//		printer.showPrinterStatus();
		
		Laptop laptop = new Laptop();
		laptop.attachPrinter(printer);
		
		Desktop desktop = new Desktop();
		desktop.attachPrinter(printer);
		
		laptop.start();
		desktop.start();

	}

}
