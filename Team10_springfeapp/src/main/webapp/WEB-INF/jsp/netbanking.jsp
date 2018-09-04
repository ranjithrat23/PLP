<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Net Banking</title>
</head>
<body background='background.jpg'>
	<center>
		<h1>Net Banking</h1>
		<form action="/payment/net">
			<table cellpadding="10" cellspacing="0" border="3" rules="none" >
				<!-- <tr>
					<td align="right">User LoginId</td>
					<td><input type="text" placeholder="Enter loginId"
						name="email" required></td>
				</tr> -->
				<tr>
					<td align="right">UserName</td>
					<td><input type="text" placeholder="Enter Username"
						name="uname" required></td>
				</tr>
				<tr>
					<td align="right">Password</td>
					<td><input type="password" placeholder="Enter Password"
						name="psw" required></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><button class="button" type="submit">Make
							Payment</button></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html></html>