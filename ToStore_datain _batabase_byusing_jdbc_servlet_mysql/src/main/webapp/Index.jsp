<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Register" method="post">
<table>

<tr><td> User Name</td><td> <input type="text" name ="uname"/></td></tr>
<tr><td> Password </td><td> <input type="pasword" name ="pass"/></td></tr>
<tr><td> Email</td><td> <input type="text" name ="email"/></td></tr>
<tr><td> Phone Number</td><td> <input type="text" name ="phone"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="register" onclick="return  loginValidation()"/></td></tr>
</table>

</form>

</body>
</html>