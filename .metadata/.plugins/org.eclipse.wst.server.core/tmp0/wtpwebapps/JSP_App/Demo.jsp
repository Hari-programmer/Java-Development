<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Hey Hi hari</h1>
<%-- <%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%> --%> <%= "Welcome "+request.getParameter("uname") %>

<%! int cube(int n){  
	return n*n*n;  
	}  
%>  
<%= "Cube of 3 is:"+cube(6) %>

<% response.sendRedirect("https://github.com/prava-coder");  %>  
</center>
</body>
</html>