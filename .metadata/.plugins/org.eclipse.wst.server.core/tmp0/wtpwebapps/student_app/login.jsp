<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if(request.getAttribute("msg")!=null){
			out.println(request.getAttribute("msg"));
		}
	%>
	<form action="login" method="post">
		Email<input type="text" name="email"/>
		password<input type="text" name="password"/>
		<input type="submit" value="login"/>
	</form>
	<%
		if(request.getAttribute("error")!=null){
			out.println(request.getAttribute("error"));
		}
	%>
</body>
</html>