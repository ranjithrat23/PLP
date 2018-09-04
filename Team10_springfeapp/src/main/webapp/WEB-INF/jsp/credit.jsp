

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
    <%@include file="footer.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Card Details</title>
</head>
<body>
<br>
<h3><c:out value="${message}">${message}</c:out></h3>
<br>
	<form action="/payment/card">
		<h1 align="center">Credit/Debit Card Info</h1>
		<center>
			<table cellpadding="10" cellspacing="0" border="3" rules="none" >
				<!-- <tr>
					<td align="right">CUSTOMER LOGINID</td>
					<td><input type="text" name="email"
						placeholder="customer@domain.com" required /> 
					</td>
				</tr> -->
				<tr>
					<td align="right">CREDIT CARD NUMBER</td>
					<td><input type="text" id="cc_num" name="cc_num"
						placeholder="1111-1111-1111-1111" required /> 
					</td>
				</tr>
				<tr>
					<td align="right">CVV</td>
					<td><input type="text" id="cvv" name="cvv" placeholder="1234"
						required /></td>
				</tr>
				<tr>
					<td align="right">EXP DATE<br>
					</td>
					<td><select id="cc_exp_mm" name="cc_exp_mm" required>
							<option value="">Month</option>
							<option value="1" selected="selected">January</option>
							<option value="2">February</option>
							<option value="3">March</option>
							<option value="4">April</option>
							<option value="5">May</option>
							<option value="6">June</option>
							<option value="7">July</option>
							<option value="8">August</option>
							<option value="9">September</option>
							<option value="10">October</option>
							<option value="11">November</option>
							<option value="12">December</option>
					</select> &nbsp; <select id="cc_exp_yyyy" name="cc_exp_yyyy" required>
							<option value="">Month</option>
							<option value="2018" selected="selected">2018</option>
							<option value="2019">2019</option>
							<option value="2020">2020</option>
							<option value="2021">2021</option>
							<option value="2022">2022</option>
							<option value="2023">2023</option>
							<option value="2024">2024</option>
							<option value="2025">2025</option>
							<option value="2026">2026</option>
							<option value="2027">2027</option>
							<option value="2028">2028</option>
							<option value="2029">2029</option>
							<option value="2030">2030</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" class="button" onclick="/payment" value="PAY" />
					</td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>