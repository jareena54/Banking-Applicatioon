<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="newacctount.Userbean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css"> 
body{
background-color: black;
color: white;
}</style>
</head>
<body>
<%Userbean u=(Userbean)request.getAttribute("bean"); %>
<h1>Welcome <%=u.getUsername()%> your account is closed <%=u.getAccountnum()%></h1>

</body>
</html>