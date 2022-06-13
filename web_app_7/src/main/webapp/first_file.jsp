<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSp Example</title>
</head>
<body>
	<h1>Scriptlet tag in jsp</h1>
	<%
	int x = 100;
	System.out.println(x);
	out.println("hello world");
	request.setAttribute("msg", "hello world");
	out.println(request.getAttribute("msg"));
	for(int i=0; i<5; i++){
		out.println(i);
	}
	//public int x=10; can't use it
	//public void test(); can't use method
	
	%>
</body>
</html>