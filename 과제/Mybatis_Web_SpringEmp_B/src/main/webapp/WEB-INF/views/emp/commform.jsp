<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
<style type="text/css">
	th{background: orange};
</style>
</head>
<body>
<h1>리스트</h1>
<br>
<form action="commform.htm" method="post">
<table cellpadding="3">
	<tr>
		<th width="50">사번</th>
		<th width="270">이름</th>
		<th width="100">직업</th>
		<th width="120">mgr</th>
		<th width="80">고용날짜</th>
		<th width="80">월급</th>
		<th width="80">comm</th>
		<th width="80">부서번호</th>
		<th width="80">체크</th>
		
	
	</tr>	


<c:forEach var="b" items="${list}">


	<tr>
		<td>${b.empno}</td>
		<td>${b.ename}</td>
		<td>${b.job}</td>
		<td>${b.mgr}</td>
		<td>${b.hiredate}</td>
		<td>${b.sal}</td>
		<td>${b.comm}</td>
		<td>${b.deptno}</td>
		<td><div><label><input type="checkbox" value="${b.empno}" name="check">선택</label></div></td>
		</tr>
</c:forEach>
</table>
<br>
<div style="float: left; width: 70%;" >
<input class="form-control" type="text" name="sel" >
</div>
<input class="btn btn-default" type="submit" value="등록">
</form>
<br>
</body>
</html>