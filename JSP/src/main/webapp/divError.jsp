<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" import="java.util.*"%>
<h1>then zero<%=exception %></h1>
Today is
<%
Date da=new Date();
out.println("<b>today is"+da.toString());%><br>



</body>
</html>