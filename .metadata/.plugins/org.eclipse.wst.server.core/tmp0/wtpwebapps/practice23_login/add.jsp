<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add number here</title>
</head>
<body>
	<form action="add" method="post">
	Number 1 <input type="text" name="num1">
	Number 2<input type="text" name="num2">
	<input type="submit" value="add"/>
	</form>
	
	<%
		if(request.getAttribute("result")!=null){
			out.println("Result is: "+request.getAttribute("result"));
		}
	%>
</body>
</html>