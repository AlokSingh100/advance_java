<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dam" class="dam.pojo"></jsp:useBean>
<jsp:setProperty property="*" name="dam"/>

<jsp:getProperty property="name" name="dam"/>
<jsp:getProperty property="pass" name="dam"/>
<%
try{
	
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver register");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
System.out.println("Sql Connection Establish");
String a= "'" +dam.getName()+"','"+dam.getPass()+"'";

System.out.println(a);
PreparedStatement insert= con.prepareStatement("Insert into pass (Name,pass) values (" +a+");");

insert.executeUpdate();
}
catch(Exception e){
	out.println(e);
}


%>
</body>
</html>