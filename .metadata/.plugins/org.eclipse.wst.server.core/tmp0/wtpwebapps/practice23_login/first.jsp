<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Scriplet tag example</h2>
	<%
		out.println("helo");
		request.setAttribute("msg","hello world");
		
		out.println(request.getAttribute("msg"));
		
		for(int i=0; i<5; i++){
			out.println(i);
		}
	
	%>
	<%!
		public int x = 10;
		
		public int test(){
			System.out.println(100);
			return 1000;
		}
	
	
	%>
	<%=test()%>
	
	
	
	
	
	
</body>
</html>