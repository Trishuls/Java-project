<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete</title>
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
		
%>
<form action="deluser" method="post">
		
		Enter username to delete: <input type="text" name="uname"><br>
		<input type="submit" value="Delete">
	</form>
	<form action="Logout.jsp" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>