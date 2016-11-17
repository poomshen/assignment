<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
<h3>검색하기</h3>


	<form action="searchs.htm?cmd=search" method="post">

		<input type="text" placeholder="부서번호" name="deptno">
		<input type="text" placeholder="매니져" name="mgr">
		<input type="text" placeholder="이름" name="ename">
		<input type="submit" value="검색">
	</form>


<hr>
	<table border="1" width="600">
		<tr>
			<td>이름</td>
			<td>부서번호</td>
			<td>직업</td>
			<td>연봉</td>
			<td>매니저번호</td>
			<td>입사일</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.ename}</td>
				<td>${list.empno}</td>
				<td>${list.job}</td>
				<td>${list.comm}</td>
				<td>${list.mgr}</td>
				<td>${list.hiredate}</td>
				
			</tr>
		</c:forEach>
	</table>	
	
</body>
</html>