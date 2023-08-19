<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Help Page</h1>
	<%-- <% 
		String name = (String)request.getAttribute("name");
		int rno = (int)request.getAttribute("rollnumber");
		LocalDateTime date = (LocalDateTime)request.getAttribute("date");
	%>
	
	<h1>Hello my name is <%=name %></h1>
	<h1>My rollNo is <%=rno %></h1>
	<h1>Date is: <%=date %></h1> --%>
	
	<h1>Hello my name is : ${name}</h1>
	<h1>My RollNumber is : ${rollnumber}</h1>
	<h1>Todays Date is : ${date}</h1>
	
	<hr/>
	
	<p>${marks}</p>
	
	<c:forEach var="item" items="${marks}">
		<%-- <h1>${item}</h1> --%>
		<h1><c:out value="${item}"></c:out></h1>
	</c:forEach>
	
</body>
</html>