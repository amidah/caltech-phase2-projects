package com.java.servlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String EMAIL = "john.smith@gmail.com";
	private final String PASSWORD = "admin@1234";
	private final String NAME = "John";
	private final Integer TOTAL_SALES = 3000;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    // here it is handling the post login request from the client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		
		String password = request.getParameter("txtPassword");
		
		ServletContext context =  getServletContext();
		String dbName = context.getInitParameter("dbName");
		
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		System.out.println("dbName: " + dbName);
		
		String htmlResponse = "";
		String loginTimeStamp = new Date().toString();
		
		if(email.equals(EMAIL) && password.equals(PASSWORD))
		{
			
			// Session Tracking with Cookies
			Cookie nameCookie = new Cookie("KEY_NAME", NAME);
			Cookie salesCookie = new Cookie("KEY_SALES", String.valueOf(TOTAL_SALES));
			
			response.addCookie(nameCookie);
			response.addCookie(salesCookie);
			
			htmlResponse = "<center>"
					+ "<h3>Welcome " + email + "</h3>"
					+ "<p>You LoggedIn at "+ loginTimeStamp +"</p>"
					+ "</center>";
		}
		else {
			htmlResponse = "<center><b>Invalid Username or Password</b></center>";
		}
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	}

}
