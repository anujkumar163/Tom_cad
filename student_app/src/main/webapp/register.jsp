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
		Name<input type="text" name="name"/>
		City<input type="text" name="city"/>
		<input type="submit" value="register"/>
	
	</form>
	<%
	if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("error"));
	}
	
	%>
</body>
</html>