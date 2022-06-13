<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of registration</title>
</head>
<body>
	<h2>ALL Registration</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>City</th>
		</tr>
		<%
			ResultSet result = (ResultSet)request.getAttribute("result");
			while(result.next()){%>
				<tr>
					<td><%=result.getString(1)%></td>
					<td><%=result.getString(2)%></td>
				</tr>
			<%} %>
	</table>
</body>
</html>