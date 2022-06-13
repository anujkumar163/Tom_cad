<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression tags</title>
</head>
<body>
	<%!
		public int test(){
			return 1000;
		}
	%>
	<%=test()%>
</body>
</html>