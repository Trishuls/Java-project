<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1

response.setHeader("Pragma", "no-cache");//HTTP1.0

response.setHeader("Expires", "0");//Proxy

session.invalidate();

response.sendRedirect("index.jsp");
%>
</body>
</html>