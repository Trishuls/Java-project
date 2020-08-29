<%@page import="java.util.ArrayList"%>
<%@page import="com.trishul.web.model.LoginGetterSetter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	
	response.setHeader("Pragma", "no-cache");//HTTP1.0
	
	response.setHeader("Expires", "0");//Proxy

	if(session.getAttribute("uname") == null)
	{
		response.sendRedirect("index.jsp");
	}
	ArrayList l1 = (ArrayList)request.getAttribute("result");
	out.println(l1);
%>
<form action="Logout.jsp" method="post">
		<input type="submit" value="Logout">
</form>
</body>
</html>