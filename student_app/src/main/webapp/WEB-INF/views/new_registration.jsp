<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
	<h2>Registration | new</h2>
	<form action="newreg" action="post">
		name<input type="text" name="name"/>
		city<input type="text" name="city"/>
		email<input type="text" name="email"/>
		password<input type="text" name="password"/>
		<input type="submit" value="save"/>
	</form>
	<%
		if(request.getAttribute("msg")!=null){
			out.println(request.getAttribute("msg"));
		}
	%>
</body>
</html>