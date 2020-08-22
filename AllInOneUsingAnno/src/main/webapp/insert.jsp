<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert user</title>
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
<form action="addcred" method="post">
		
		Enter username: <input type="text" name="uname"><br>
		Enter password: <input type="password" name="pass"><br>
		<input type="submit" value="add">
	</form>
	<form action="Logout.jsp" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>