<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
Student Name: ${tempstudent.name}<br/>
Student Department : ${tempstudent.department}<br/>
Student Year : ${tempstudent.year}<br/>
Student's Intrest : 

<c:forEach var="intrest" items="${tempstudent.intrests}" >
    <c:out value="${intrest}"></c:out>
  </c:forEach>
</body>
</html>