<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="newacctount.Userbean" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: black;
	color: white;
}
h2{
background-color: grey;
color: white;
font-size: 25px;
font-style: italic;
}

</style>
</head>
<body>
<%List l=(List)request.getAttribute("checkbean"); %>
<%out.println(l); %>
</body>
</html>