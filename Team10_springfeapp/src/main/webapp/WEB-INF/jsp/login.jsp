<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<% session.invalidate(); %>
<br>
<center>
<form action="/session">
<table cellspacing="0" cellpadding="10" border="1" rules="none">
<tr bgcolor="#333">
<th colspan="2">
<font color="white">
ADD to cart
</font>
</th>
</tr>
<tr>
<td>

Enter the email Id : </td><td><input type="text" id="txtemail2" name="email" required/>
</td>
<tr align="center">
<td colspan="2">
<input type="submit" class="button" value="Login">
</td>
</tr>
</table>
</form>
</center>
</body>
</html>