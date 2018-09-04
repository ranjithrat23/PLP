<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CapStore</title>
<script type="text/javascript">
function myFunction() {
    alert("Added to cart succesfully");
}
</script>
</head>
<body>

<center>
<br>
<br>

<br>
<table class="plain" cellpadding="10" cellspacing="0" border="1">
<tr>
<c:forEach items="${products}" var="pro">

<td align="center">
<img src="../images/${pro.productName}.PNG"><br>
${pro.productName}<br>
${pro.productPrice}<br>
<a onclick="myFunction()" href="/addToCart?email2=<%= session.getAttribute("email")%>&product=${pro.productId}">ADD to Cart</a>
</td>

</c:forEach>
</tr>
</table>

</center>
</body>
</html>