<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post">
		<table>
			<tr>
				<td><label>Id:</label></td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Reset"></td>
			<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>