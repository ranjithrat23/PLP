<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>

<script type="text/javascript">
	 function redirect(use, rname) {

		for (var val = 0, r1 = use.elements; val < r1.length; val++) {
			if (r1[val].name == rname && r1[val].checked) {
				if (val == 0) {
					use.action = document.getElementById("r1").value;
				} else {
					use.action = r1[val].value;
				}
			}
		}
	} 
	
	
</script>

</head>
<body>
	<center>

		<form action="#" onsubmit="redirect(this, 'r1');">
			<h1>Payment Options</h1>
			<table cellpadding="10">


				<tr>
					<td><input type="radio" name="r1">
					<!-- value="netbanking" --> NET BANKING<br> 
					<select id="r1">
							<option selected value=default >Select Bank</option>
							<option value="netbanking">Indian Bank</option>
							<option value="netbanking">HDFC Bank</option>
							<option value="netbanking">ICICI Bank</option>
							<option value="netbanking">Axis Bank</option>
							<option value="netbanking">CITI Bank</option>
							<option value="netbanking">State Bank of India</option>
							<option value="netbanking">Canara Bank</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="radio" name="r1"
					value= "wallet">WALLET<br> 
					<select id="r2">
							<option selected value=default >Select Wallet</option>
							<option value="googlepay">Tez</option>
							<option value="paytm">Paytm</option>
							<option value="mobikwik">Mobikwik</option>
							<option value="phonepe">PhonePe</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="radio" name="r1" value="credit">CREDIT/DEBIT
						CARD</td>
				</tr>
				<tr>
					<td><input type="radio" name="r1" value="cashondelivery">CASH
						ON DELIVERY</td>
				</tr>
				<tr>
					<td align="center"><input class="button" type="submit" value="Next" />
						
						</td>
				</tr>

			</table>
		</form>

	</center>
</body>
</html>