<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Finder page</title>
</head>
<body>
	<form action="finder2" method="post">
		<span>Emp ID</span><input type="text" name="empId"><br> <input
			type="hidden" name="opration" value="find"> <input
			type="submit" value="Find">
	</form>
	<c:set var="emp" value="${e}"/>
	
	<c:out value="${emp.empId}"></c:out>
	<c:out value="${emp.name}"></c:out>
	<c:out value="${emp.city}"></c:out>
	<c:out value="${emp.salary}"></c:out>

</body>
</html>