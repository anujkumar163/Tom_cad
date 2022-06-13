<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add2" method="post">
		number1<input type="text" name="num1"/>
		number2<input type="text" name="num2"/>
		<input type="submit" value="add"/>
	
	</form>
<%
	if(request.getAttribute("result")!=null){
		out.println(request.getAttribute("result"));
	}
%>	
</body>
</html>