<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registor Page</title>
</head>
<body>
<h1>Register Employee</h1>
<hr>
<form action="registar" method="post">
<span>Emp ID</span><input type="text" name="empId"><br>
<span>Name</span><input type="text" name="name"><br>
<span>City</span><input type="text" name="city"><br>
<span>Salary</span><input type="text" name="salary"><br>
<input type="hidden" name="opration" value="register"><br>
<input type="submit" value="Registar">
</form>


</body>
</html>