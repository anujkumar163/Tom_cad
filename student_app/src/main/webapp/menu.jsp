<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>for this to call servlet url in get method getRequestDispatcher 
	should be their so that it can call that page by forward</h2>
	<a href="register">new registration</a>
	<a href="ListAll">All registration</a>
	<form action="logout" method="post">
		<input type="submit" value="logout">
	</form>
</body>
</html>