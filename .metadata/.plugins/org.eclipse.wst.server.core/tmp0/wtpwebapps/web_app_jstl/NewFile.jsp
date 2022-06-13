<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="hello"></c:out>

	<c:set var="name" value="mike"></c:set>
	<c:out value="${name}"></c:out>
	
	<c:set var="income" value="${4000*4}"/>
		<c:if test="${income>8000 }">
	<p>My income is: <c:out value="${income}"/></p>
	</c:if>		
	
	<c:forEach var="j" begin="1" end="3">
		Item<c:out value="${j}"/><p>
		</p>
		</c:forEach>
	
	
	
	
	
	
</body>
</html>