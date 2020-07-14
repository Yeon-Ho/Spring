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

<h1>사원 정보</h1>
<hr>


<table style="border: 1px solid #ccc" >
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

<c:forEach items="${list }" var="e">
<tr>
	<td>${e.empno }</td>
	<td><a href="/emp/detail?empno=${e.empno }">${e.ename }</a></td>
	<td>${e.job }</td>
	<td>${e.mgr }</td>
<%-- 	<td>${e.hiredate }</td> --%>
	<td>
		<fmt:formatDate value="${e.hiredate }" pattern="yyyyMMdd"/>
	</td>
	
	<td>${e.sal }</td>
	<td>${e.comm }</td>
	<td>${e.deptno }</td>
</tr>

</c:forEach>

</table>

<br>
<a href="/dynamic/query">이전 페이지</a>

</body>
</html>