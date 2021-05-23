<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="cs6359.utdcart.controller.*" %>
<%@ page import="java.time.LocalDate"%>

<%--@ page contentType="text/html" import="java.util.*" --%>


<!DOCTYPE html>

<html>

<head><title>Add Payment Page</title></head>

<body>
	
	<% long cardNumber = Long.parseLong(request.getParameter("cardno")); %>
	<% int cvv = Integer.parseInt(request.getParameter("cvv")); %>
	
	<% LocalDate date = LocalDate.now(); %>
	
	<% CustomerController customercontroller = new CustomerController();%>
	
	<%= customercontroller.addPaymentMethod(cardNumber, cvv, date) %>
	<jsp:forward page="customerPage.html" />
</body>
</html>

