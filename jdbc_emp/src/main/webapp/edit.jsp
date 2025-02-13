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

<jsp:useBean class="cruds.doaPojo" id="sap" ></jsp:useBean>

<%
response.setContentType("text/html");
int id =Integer.parseInt( request.getParameter("id"));
out.println(id);
doa daao=new doa();


doaPojo po=new doaPojo();
po=daao.getId1(id);
out.println(po.getName());
%>
<form action="edSave.jsp">
<pre>
ID:-		<input type="text" name="id" value="<%out.print(po.getId());  %>">

Name:- 		<input type="text" name="name" value="<%out.print(po.getName()) ; %>">
 
Mail:- 		<input type="text" name="mail" value="<%out.print(po.getMail()) ; %>" >

Salary:- 	<input type="text" name="sal" value="<%out.print(po.getSal()) ; %>">

<input type="submit" >

</pre>


</form>

</body>
</html>