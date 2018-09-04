<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wallet</title>
</head>
<body>

<br><br>
<center>
<h1>Wallet</h1>
<form action="/payment/wallet">
<table cellpadding="10" cellspacing="0" border="3" rules="none" >
<!-- <tr>
<td align="right">
Enter Login Id 
</td>
<td>
<input type="text" name="email" required/>
</td>
</tr>
 -->
<tr>
<td align="right">
Enter Mobile number 
</td>
<td>
<input type="text" name="mobile" required/>
</td>
</tr>

<tr>
<td align="right">
Enter password 
</td>
<td>
<input type="password" name="password" required/>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input class="button" type="submit" value="PAY" />
</td>
</tr>
</table>
</form>
</center>
</body>
</html>