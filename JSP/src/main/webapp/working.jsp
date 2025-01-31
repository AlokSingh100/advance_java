<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="test" class="demo.worker"></jsp:useBean>
<jsp:setProperty property="sal" name="test"/>
<jsp:setProperty property="name" name="test"/>
<jsp:forward page="/calc"></jsp:forward>
</body>
</html>