<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home page</h1>
	<h1>Called By Home Controller</h1>
	<h1>url /home</h1>
	<h2>Hello URL</h2>
	<%
	String name = (String)request.getAttribute("name");
	int id = (int)request.getAttribute("id");
	%>
	<h3>My name is <%=name %></h3>
	<h3>My Id is <%=id %></h3>
	<%
	List<String> friends = (List<String>)request.getAttribute("friends");
		for(String friend: friends){
			%>
			<h1><%= friend %></h1>
		<% }%>
	
</body>
</html>