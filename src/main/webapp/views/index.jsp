<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First spring boot page</title>
</head>
<body>
	<form action="save">
		Input Cars Id : <input type="text" name="id"><br>
		<br> Input Cars Name: <input type="text" name="name"><br>
		<br> Input Cars Owner : <input type="text" name="owner"><br>
		<br> Input Cars Model: <input type="text" name="model"><br>
		<br> <input type="submit" name="submit"><br>
		<br>
		<br>
		<div>
			<h4>Search any car by id -</h4>
			<br>
			<br>
		</div>
	</form>
	<form action="searchCar" method="get">
		Input Cars Id : <input type="text" name="id"><br>
		<br> <input type="submit" name="submit"><br>
	</form>
</body>
</html>