<%@page import="cruds.doaPojo"%>
<%@page import="cruds.doa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%
int id =Integer.parseInt( request.getParameter("id"));
out.print(id);
doa a=new doa();
List <doaPojo> cs=new ArrayList<>();




%>
</body>
</html>