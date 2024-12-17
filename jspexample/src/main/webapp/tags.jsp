<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>
	
	
	<h3>Lets access elements declared inside declarative tag</h3>
	<%
		out.print("App Name: " + appName + "<br>");
		out.print("Punch Line: " + punchLine + "<br>");
		out.print("Discount: " + getDiscount("JUMBO")+ "<br>");
	%>
	
	
	<h3>Scriptlet Tag</h3>
	<%
		int x = 10;
		int y = 20;
		int z =  x * y;
		
		String name = "John";
		out.println("z = " + z);
		out.println("name = " + name);
	%>

	<h3>Declarative Tag</h3>
	<%!
 		String appName = "eStore";
		String punchLine = "We deliver in no  time!";
		
		double getDiscount(String promoCode){
			
			if(promoCode.equals("JUMBO")){
				return 0.40;
			}
			return 0.20;
		}
	%>
	
	
	
</body>
</html>