<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="laok"></c:set>
<h1>hallo <c:out value="${name}"></c:out></h1>

<c:import url="https://www.javatpoint.com/pojo-in-java"></c:import>

<c:catch var="exp">
<c:import url="https://ww.javatpoint.com/pojo-in-java"></c:import>

<c:out value="${exp }"></c:out>
<br>

<c:if test="${not empty exp }">
Sorry
<c:out value="${exp }"></c:out>
</c:if>

</c:catch>
</body>
</html>