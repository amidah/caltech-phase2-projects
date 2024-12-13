package com.java.servlet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	// here it is handling the get register request from the client
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("txtName");
		
		String email = request.getParameter("txtEmail");
		
		String phone = request.getParameter("txtPhone");

		String password = request.getParameter("txtPassword");

		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("Password: " + password);

		response.setContentType("text/html");
		String registerTimeStamp = new Date().toString();
		String htmlResponse = "<center>" + "<h3>Thank You " + name + "</h3>" + 
		"<p>You are registered with email " + email + " at " + registerTimeStamp
				+ "</p>" + "</center>";
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	}

}
