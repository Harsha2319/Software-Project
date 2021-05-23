<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="cs6359.utdcart.controller.*" %>
<!DOCTYPE html>

<html>

<head><title>Register Page</title></head>

<body>
	
	<% String username = request.getParameter("username"); %>
	<% String password = request.getParameter("password"); %>
	<% String firstName = request.getParameter("firstName"); %>
	<% String lastName = request.getParameter("lastName"); %>
	<% String email = request.getParameter("email"); %>
	<% String userType = request.getParameter("accountType"); %>
	
	<% UserController usercontroller = new UserController();%>
	
	<%= usercontroller.register(username, password, firstName, lastName, email, userType) %>
	<jsp:forward page="loginCarPool.html" />
</body>
</html>

