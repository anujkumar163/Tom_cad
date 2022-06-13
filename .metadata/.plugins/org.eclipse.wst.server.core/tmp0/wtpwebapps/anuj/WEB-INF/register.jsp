<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		name<input type="text" name="name"/>
		city<input type="text" name="city"/>
		<input type="submit" value="save"/>
	</form>
	<%
		if(request.getAttribute("register")!=null){
			out.println(request.getAttribute("register"));
		}
	%>
</body>
</html>