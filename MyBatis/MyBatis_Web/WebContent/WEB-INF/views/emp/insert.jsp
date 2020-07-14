<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새로운 사원 정보 추가</title>
</head>
<body>

<form action="/emp/insert" method="post">
<table>
<tr>
<td><label for="empno">사원번호 : </label>
<input type="number" id="empno" name="empno" min="1" max="9999" required="required"/></td>
</tr>

<tr>
<td><label for="ename"> 사원이름 : </label>
<input type="text" id="ename" name="ename"></td>
</tr>

<tr>
<td> <label for="job"> 직무 :</label>
<input type="text" id="job" name="job"></td>
</tr>

<tr>
<td><label for="mgr"> 매니저 : </label>
<input type="text" id="mgr" name="mgr" min="1" max="9999" /></td>
</tr>

<tr>
<td><label for="hiredate"> 입사일자 : </label>
<input type="date" id="hiredate" name="hiredate" /></td>
</tr>

<tr>
<td><label for="sal"> 급여 : </label>
<input type="number" id="sal" name="sal" /></td>
</tr>

<tr>
<td><label for="comm"> 상여금 : </label>
<input type="number" id="comm" name="comm"></td>
</tr>

<tr>
<td><label for="deptno"> 부서번호 : </label>
<select id="deptno" name="deptno">
	<option value=""></option>
	<option value="10">ACCOUNT</option>
	<option value="20">RESEARCH</option>
	<option value="30">SALES</option>
	<option value="40">OPERATIONS</option>
</select> </td>
</tr>

</table>

<button>추가</button>
</form>

<hr>
<button onclick="history.go(-1)">뒤로 가기</button>

<hr>
<button onclick="location.href='/emp/list'">목록으로 가기</button>


</body>
</html>