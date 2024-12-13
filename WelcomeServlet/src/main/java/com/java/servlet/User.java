package com.java.servlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String appName = config.getInitParameter("appName");
		
		String dbPassword = config.getInitParameter("dbPassword");
		
		ServletContext context =  getServletContext();
		String dbName = context.getInitParameter("dbName");
		
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String htmlResponse = "<center><h3>"+appName+"</h3>"
				+ "<p>DB Name: "+dbName+"</p>"
				+ "<p>DB Password: "+dbPassword+"</p></center>";
		out.print(htmlResponse);
		
		//Read the cookies, which we have stored in the login servlet
		
		Cookie[] cookieArr = request.getCookies();
		
		for(Cookie cookie : cookieArr) {
			out.print("<center><p>Cookie Name: " + cookie.getName() + " - "+ cookie.getValue() +"</p></center>");
		}
		 
	}

}
