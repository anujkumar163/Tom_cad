<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
	Name:<input type="text" name="name">
	<label>Age</label>
	<input type="number" name="age">
	<label>City</label>
	<input type="text" name="city">
	<input type="submit" value="submit">
	</form>
	<%
	if(request.getAttribute("msg")!= null){
		out.println(request.getAttribute("msg"));
	}
	%>
	
</body>
</html>