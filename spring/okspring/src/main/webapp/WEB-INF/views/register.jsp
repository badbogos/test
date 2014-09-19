<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<form method="POST" action="register.do">
		id : <input type="text" name ="id" value="${user.id}"><br>
		pw : <input type="password" name="pwd">
		
		<br>
		conform pw: <input type="password" name="confirmpwd"><br>
		<input type="submit" value="register">
		<br>
		<span>${msg}</span>
	</form>
</html>