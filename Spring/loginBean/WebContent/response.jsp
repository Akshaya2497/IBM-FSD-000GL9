<%@page import="userpack.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body>
<jsp:useBean id="u" class="userpack.Users" scope="request">

<jsp:setProperty name="u" property="*"/>
</jsp:useBean>
<%=u.validate(u.getName(),u.getPass()) %>
</body>
</html>