<%@page import="java.sql.PreparedStatement"%>
<%@ page import="com.jsp.model.Users"%>
<%@ page import="com.jsp.db.DB"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Users users = new Users();

users.name = request.getParameter("txtName");
users.email = request.getParameter("txtEmail");
users.password = request.getParameter("txtPassword");

DB db = DB.getDB();

String sql = "insert into USERS values(null, ?, ?, ?)";

PreparedStatement preparedStatement = db.connection.prepareStatement(sql);

// here we are setting the values of three paramaters (?, ?, ?)
preparedStatement.setString(1, users.email);
preparedStatement.setString(2, users.password);
preparedStatement.setString(3, users.name);

int result = db.executeUpdate(preparedStatement);

if (result > 0) {
%>
<h3>
	Thank you for Registration:
	<%=users.name%></h3>
<%
} else {
%>
<h3>Registration Failed: <%= users.name%></h3>
<%
}
%>

