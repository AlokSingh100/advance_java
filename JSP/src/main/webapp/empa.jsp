<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="test" class="demo.Emp">
	

<jsp:setProperty property="emp" name="test"/>
<jsp:setProperty property="name" name="test"/>
</jsp:useBean>






hallo

<jsp:getProperty property="emp" name="test"/>you id
<jsp:getProperty property="name" name="test"/>


</body>
</html>

