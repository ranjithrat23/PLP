<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

/* Style the body */
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

table {
	background-image: url("images/Silver-Blur-Background-Wallpaper.jpg");
}

.plain {
	background-image: none;
}
/* Header/logo Title */
.header {
	padding: 20px;
	text-align: center;
	background-image: url("images/bg.jpg");
	color: Black;
}

/* Increase the font size of the heading */
.header h1 {
	font-size: 40px;
}

/* Style the top navigation bar */
.navbar {
	overflow: hidden;
	background-color: #333;
}

/* Style the navigation bar links */
.navbar a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

/* Main column */
.main {
	-ms-flex: 70%; /* IE10 */
	flex: 70%;
	background-color: white;
	padding: 20px;
}

/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
	.row {
		flex-direction: column;
	}
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
	.navbar a {
		float: none;
		width: 100%;
	}
}

.button {
	background-color: black;
	border: none;
	color: white;
	padding: 5px 30px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	-webkit-transition-duration: 0.4s; /* Safari */
	transition-duration: 0.4s;
	cursor: pointer;
}
</style>
</head>

<body>

	<div class="header">
		<h1>CapStore</h1>
	</div>
	<div class="navbar">
		<div>
			<a href="/loggedin">CapStore</a>
		</div>
			<div>
				<a>Login Id </a>
			</div>
			
			<div>
				<a href="/cart?email=<%=session.getAttribute("email")%>">Cart</a>
			</div>
					<div>
				<a href="/">LogOut</a>
			</div>
		
	</div>
</body>
</html>
