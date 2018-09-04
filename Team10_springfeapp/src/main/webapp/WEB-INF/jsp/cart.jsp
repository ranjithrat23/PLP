<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
<center>

	<h1>Cart</h1>
	<table cellpadding="10" border="1" cellspacing="0" bgcolor="white">
		<tr bgcolor="black">
			<th colspan="2"><font color="white">NAME</font></th>
			<th><font color="white">Description</font></th>
			<th><font color="white">PRICE</font></th>
		</tr>
		<c:forEach items="${cartProduct}" var="product">
			<tr align="center">
				<td>${product.productName}<br>
				</td><td><a href="/removeCart?customerId=<%=request.getParameter("email") %>&productId=${product.productId}">Remove</a></td>
				<td>${product.productDescription}<br>
				</td>
				<td>Rupees ${product.productPrice} <br>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="/payment"><input type="button" class="button" value="Buy Now"/></a>
	</center>
</body>
</html>