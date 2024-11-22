package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MovieTicket{
	
	String movieName;
	String seatNumber;
	boolean isTicketBooked;
	String emailUser;
	static int ticketNumber;
	
	public MovieTicket() {
		
	}

	public MovieTicket(String movieName, String seatNumber, boolean isTicketBooked, String emailUser) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.isTicketBooked = isTicketBooked;
		this.emailUser = emailUser;
	}

	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatNumber=" + seatNumber + ", isTicketBooked="
				+ isTicketBooked + ", emailUser=" + emailUser + "]";
	}
	
	
}

class MovieTicketBookingTask implements Callable<String>{

	MovieTicket ticket;
	
	public MovieTicketBookingTask(MovieTicket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public synchronized String call() throws Exception {
			
		ticket.seatNumber = "A" + MovieTicket.ticketNumber;
		ticket.isTicketBooked = true;
		MovieTicket.ticketNumber++;
		System.out.println("Paying for the ticket seat: " + ticket.seatNumber + " for user: " + ticket.emailUser);
		System.out.println("Ticket booked for " + ticket.emailUser);
		System.out.println();
		
		
		return "Ticket Booked for " + ticket.emailUser + " with seat number: " + ticket.seatNumber;
		
	}
	
}

public class CallableFutureApp {

	public static void main(String[] args) {
		
		System.out.println("Movie Ticket Booking App Started");
		
		MovieTicket movieTicket1 = new MovieTicket("Avengers", "A1", false, "john@gmail.com");
		MovieTicket movieTicket2 = new MovieTicket("Avengers", "A2", false, "sam@gmail.com");
		MovieTicket movieTicket3 = new MovieTicket("Avengers", "A3", false, "alex@gmail.com");
		MovieTicket movieTicket4 = new MovieTicket("Avengers", "A4", false, "roy@gmail.com");
		MovieTicket movieTicket5 = new MovieTicket("Avengers", "A5", false, "celina@gmail.com");
		
		System.out.println(movieTicket1);
		System.out.println(movieTicket2);
		System.out.println(movieTicket3);
		System.out.println(movieTicket4);
		System.out.println(movieTicket5);
		
		System.out.println("Processors:" + Runtime.getRuntime().availableProcessors());
		
		Callable task1 = new MovieTicketBookingTask(movieTicket1);
		Callable task2 = new MovieTicketBookingTask(movieTicket2);
		Callable task3 = new MovieTicketBookingTask(movieTicket3);
		Callable task4 = new MovieTicketBookingTask(movieTicket4);
		Callable task5 = new MovieTicketBookingTask(movieTicket5);
	
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		Future<String> future1 = service.submit(task1);
		Future<String> future2 = service.submit(task2);
		Future<String> future3 = service.submit(task3);
		Future<String> future4 = service.submit(task4);
		Future<String> future5 = service.submit(task5);
		
		try {
			System.out.println("Task1 Result: " + future1.get());
			System.out.println("Task2 Result: " + future2.get());
			System.out.println("Task3 Result: " + future3.get());
			System.out.println("Task4 Result: " + future4.get());
			System.out.println("Task5 Result: " + future5.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Movie Ticket Booking App Finished");
	}

}
