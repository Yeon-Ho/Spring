<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>신규 부서 추가</h1>
<hr>

<form action="/dept/insert" method="post">

<label for="deptno">
부서번호 : <input type="number" min="0" max="99" name="deptno" id="deptno"><br>  
</label>
<label for="dname">
부서이름 : <input type="text" name="dname" id="dname"><br>
</label>
<label for="loc">
지역 : <input type="text" name="loc" id="loc"><br>  
</label>

<button>추가</button>

</form>

</body>
</html>