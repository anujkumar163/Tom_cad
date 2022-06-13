<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>update mobile number</h2>
	<form action="update" method="get">
		<pre>
		name<input type="text" name="name" value="<%=request.getAttribute("name") %>">
		city<input type="text" name="city" value="<%=request.getAttribute("city") %>">
		<input type="submit" value="save">
		</pre>
	</form>
</body>
</html>