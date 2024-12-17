<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h3>Welcome to my JSP</h3>
	<%
		int a = 10;
		int b = 20;
		int c = a + b;
		out.print("<h4>c is :" + c + "</h4>");
	%>
	
	<a href="tags.jsp">JSP Tags</a>
	<br>
	<br>
	
	<h3>Register with us</h3>
	
	<div style="align-items: center;">
	
		<form action="register.jsp" method="post">
			
			Enter Name: <br>
			<input type="text" name="txtName"><br><br>
			
			Enter Email: <br>
			<input type="text" name="txtEmail"><br><br>
			
			Enter Password: <br>
			<input type="password" name="txtPassword"><br><br>
			
			<input type="submit" value="Register">
			
		</form>
		
	</div>
	
</body>
</html>