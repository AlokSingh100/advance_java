<%@page import="cruds.doaPojo"%>
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
<%
int id =Integer.parseInt( request.getParameter("id"));
doa doa=new doa();
doa.deleteEmp(id);
request.getRequestDispatcher("show.jsp").forward(request, response);

%>
</body>
</html>