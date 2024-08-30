<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h2>Register Here</h2>
	<br>
	<div class="register">
		<form method="post" action="reg">
			<label><b>User Name</b></label><br> <input type="text"
				name="uname" id="textBox" placeholder="User Name"> <br>
			<br> <label><b>Email</b></label><br> <input type="text"
				name="mail" id="textBox" placeholder="Email"> <br> <br>
			<label><b>Password</b></label><br> <input type="password"
				name="pass" id="textBox" placeholder="Password"> <br> <br>
			<label><b>Gender</b></label><br> <input type="radio"
				name="gender" value="male" />Male <input type="radio" name="gender"
				value="female" />Female <input type="radio" name="gender"
				value="other" />Other <br> <br>
			<label><b>Address</b></label><br>
			<textarea rows="2" cols="20" id="textBox" class="form" name="address"></textarea>
			<br> <br> <input type="submit" id="sub" value="Register">
			<br> <br> <a href="login.jsp">Already Registered? Sign
				in instead of Register</a>
		</form>
	</div>
</body>
</html>