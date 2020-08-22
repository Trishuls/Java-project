<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>

Trishul welcomes you

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	
	response.setHeader("Pragma", "no-cache");//HTTP1.0
	
	response.setHeader("Expires", "0");//Proxy
	
	if(session.getAttribute("uname") == null)
	{
		response.sendRedirect("index.jsp");
	}
		
%>

<form action="insert" method="post">
		<input type="submit" value="Insert">
	</form>
	<form action="delete" method="post">
		<input type="submit" value="Delete">
	</form>
	<form action="view" method="get">
		
		<input type="submit" value="View">
	</form>
	<form action="Logout.jsp" method="post">
		<input type="submit" value="Logout">
	</form>
</head>
<body>

</body>
</html>