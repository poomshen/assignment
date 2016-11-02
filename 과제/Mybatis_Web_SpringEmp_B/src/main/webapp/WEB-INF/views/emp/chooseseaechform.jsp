<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	th{background: gray};
</style>
<title>리스트</title>
</head>
<body>
<h1>리스트</h1>
<form action="choosesearch.htm" method="post">
<input type="radio" value="no" name="choose" checked="checked">사번 
<input type="radio" value="name" name="choose">이름 
<input type="radio" value="job" name="choose">직업
<input type="text" name="search">
<input type="submit" value="조건 검색">
</form>
<table cellpadding="3" class="table table-bordered">
	<tr>
		<th width="50">사번</th>
		<th width="270">이름</th>
		<th width="100">직업</th>
		<th width="120">mgr</th>
		<th width="80">고용날짜</th>
		<th width="80">월급</th>
		<th width="80">comm</th>
		<th width="80">부서번호</th>
		
	
	</tr>	

<c:forEach var="b" items="${list}">


	<tr>
		<td><a href="read.htm?empno=${b.empno}">${b.empno}</a></td>
		<td>${b.ename}</td>
		<td>${b.job}</td>
		<td>${b.mgr}</td>
		<td>${b.hiredate}</td>
		<td>${b.sal}</td>
		<td>${b.comm}</td>
		<td>${b.deptno}</td>
		</tr>
</c:forEach>

</table>
</body>
</html>