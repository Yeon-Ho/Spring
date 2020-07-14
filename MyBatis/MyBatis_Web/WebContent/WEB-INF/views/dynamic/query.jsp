<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>목록</h1>
<hr>

<table>
<tr>
	<th>번호</th>
	<th>아이디</th>
	<th>비밀번호</th>
</tr>
<c:forEach items="${list }" var="map" >
<tr>
	<td>${map.NO}</td>
	<td>${map.ID}</td>
	<td>${map.PW}</td>
</tr>
</c:forEach>
</table>


</body>
</html>