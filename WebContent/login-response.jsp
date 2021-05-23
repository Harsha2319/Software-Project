<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="cs6359.utdcart.controller.*" %>
<!DOCTYPE html>
<html>

<head><title>Login Page</title></head>

<body>
	<% String userName = request.getParameter("username"); %>
	<% String password = request.getParameter("password"); %>
	<% UserController usercontroller = new UserController(); %>
	<% int output = usercontroller.login(userName, password); %>
	<% System.out.println("Output : "+output); %>
	<%-- 
	<% if (output == 0) { %>
	 <jsp:forward page="customerPage.html" />
	 <% } else if (output == 1) { %>
	  <jsp:forward page="driverPage.html" />
	 <% } else if (output == -1){%>
	  <jsp:forward page="login-error.html" />
	  <% } %> --%>
	  
	  <%
         switch(output) {
            case 0: %>
               <jsp:forward page="customerPage.html" />
               <% break;
            case 1: %>
               <jsp:forward page="driverPage.html" />
               <% break;
            default: %>
               <jsp:forward page="login-error.html" />
         <% }
      %>
	  
</body>
</html>