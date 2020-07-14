<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>선택한 사원 정보</h1>
<hr>

<table>
<tr>
	<th>사원번호</th>
	<th>사원이름</th>
	<th>직무</th>
	<th>매니저</th>
	<th>입사날짜</th>
	<th>급여</th>
	<th>상여금</th>
	<th>부서번호</th>
</tr>

<tr>
	<td>${view.empno }</td>
	<td>${view.ename }</td>
	<td>${view.job }</td>
	<td>${view.mgr }</td>
	<td>
		<fmt:formatDate value="${view.hiredate }" pattern="yyyyMMdd"/>
	</td>
	<td>${view.sal }</td>
	<td>${view.comm }</td>
	<td>${view.deptno }</td>
</tr>

</table>
<br>
<button onclick='location.href="/emp/list"'>전체목록</button>

</body>
</html>