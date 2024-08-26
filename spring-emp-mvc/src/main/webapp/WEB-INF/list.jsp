<%@page import="com.demo.spring.entity.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Page</title>
</head>
<body>
<h2> Employee List</h2>
	<table></table>
	<c:forEach var="emp" items="${eList}">
		<td><c:out value="${emp.empId}"></c:out></td>
		<td><c:out value="${emp.name}"></c:out></td>
		<td><c:out value="${emp.city}"></c:out></td>
		<td><c:out value="${emp.salary}"></c:out></td>	
	</c:forEach>
	</table>
</body>
</html>