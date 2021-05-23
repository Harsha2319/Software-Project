<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="cs6359.utdcart.controller.*" %>
<!DOCTYPE html>
<html>

<head><title>Book Ride Page</title></head>

<body>
	<h1>Book ride is confirmed</h1>
    <h2>Your driver: ram</h2>	
    
	<% String src = request.getParameter("origin"); %>
	<% String dest = request.getParameter("inputDestination"); %>
	
	<% CustomerController customercontroller = new CustomerController();%>
	
	<% int result = customercontroller.SearchRide(src,dest); %>
	<h2>Estimate time: <%= result %> mins </h2>
</body>
</html>