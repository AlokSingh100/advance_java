<%@page import="cruds.doa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="cruds.doaPojo" id="nap" ></jsp:useBean>
<jsp:setProperty property="*" name="nap"/>
<jsp:getProperty property="id" name="nap"/>

<%
doa ob=new doa();
ob.updateEmp(nap);
request.getRequestDispatcher("show.jsp").forward(request, response);

%>
</body>
</html>