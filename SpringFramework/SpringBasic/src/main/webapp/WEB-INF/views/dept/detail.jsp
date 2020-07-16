<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>부서 상세 정보</h1>
<hr>

<table>
<tr>
	<th>부서번호</th>
	<th>부서명</th>
	<th>부서지역</th>
</tr>

<tr>
	<td>${dept.deptno }</td>
	<td>${dept.dname }</td>
	<td>${dept.loc }</td>
</tr>
</table>


</body>
</html>