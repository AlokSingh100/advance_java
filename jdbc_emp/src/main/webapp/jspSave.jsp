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
<jsp:useBean class="cruds.doaPojo" id="sap" ></jsp:useBean>

<jsp:setProperty property="*" name="sap"/>




<%
out.print("name=  "+sap.getName());
out.print("  sal="+sap.getSal());

doa ob=new doa();
ob.save(sap);
request.getRequestDispatcher("show.jsp").forward(request, response);

%>


</body>
</html>