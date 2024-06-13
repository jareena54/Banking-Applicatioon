<%@page import="newacctount.NewAccountDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="newacctount.Userbean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<%
	Userbean u = (Userbean) request.getAttribute("userbean");
	int m=NewAccountDAO.newaccount(u);
	if(m>1){
		out.println("Registred new Account");
	}
	%>
	<h1>UserName:</h1>
	<%=u.getUsername()%>
	<h1>Password:</h1>
	<%=u.getPword()%>
	
	<h1>Amount:</h1>
	<%=u.getAmount()%>
	<h1>Address:</h1>
	<%=u.getAdress()%>
	<h1>PhoneNumber:</h1>
	<%=u.getPnumber()%>
	<h1>New Account Number </h1>
	<%=u.getAccountnum() %>

</body>
</html>