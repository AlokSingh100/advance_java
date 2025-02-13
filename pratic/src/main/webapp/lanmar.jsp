<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*, java.text.*"  %>
 
    <%  
    String ln=request.getParameter("lan");
    Locale aa=new Locale(ln,"IN");
    ResourceBundle bundle=ResourceBundle.getBundle("Massage",aa);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><% out.println(bundle.getString("welcomemessage")); %></h1>
<form >
<table>
<tr>
<td><%out.print(bundle.getString("firstname")); %></td>
<td><input type="text"></td>
</tr>
<tr>
<td><%out.print(bundle.getString("lastname")); %></td>
<td><input type="text"></td>
</tr>
<tr>
<td><%out.print(bundle.getString("birthday")); %></td>
<td><input type="text"></td>
</tr>
<tr>
<td><%out.print(bundle.getString("gender")); %></td>
<td><input type="text"></td>
</tr>
<tr><input type="submit" value="<%out.println(bundle.getString("Submit")); %>"></tr>
</table>
</form>
</body>
</html>