<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h2>Login</h2>
	<div class="login">
		<form id="login" action="log" method="post">
			<label><b>User Name</b></label> <input type="text" name="uname"
				id="textBox" placeholder="User Name"> <br> <br> <label><b>Password</b></label>
			<input type="password" name="pass" id="textBox"
				placeholder="Password"> <br> <br> <input
				type="submit" id="sub" value="Log In"> <br> <br> <a
				href="register.jsp">New User! Register Here</a>
		</form>
	</div>
</body>
</html>