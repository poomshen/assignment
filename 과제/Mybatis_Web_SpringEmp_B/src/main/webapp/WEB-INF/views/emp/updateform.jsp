<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 수정</title>


<style type="text/css">
	th {text-align: right; background: orange}

</style>

</head>
<body>
<h1>글 수정</h1>
<form name = "writeform" action="update.htm" method="post">
<table width="600">
	<tr>
		<th>사번</th>
		<td>
			<input type="text" name="empno" maxlength="5" size="12" value="${b.empno}"/>
		</td>
	</tr>
	
	<tr>
		<th>이름</th>
		<td>
			<input type="text" name="ename" maxlength="12"  size="13" value="${b.ename}"/>
		</td>
	</tr>
	<tr>
		<th>직업</th>
		<td>
			<input type="text" name="job" maxlength="30"  size="30" value="${b.job}" />
		</td>
	</tr>
		<tr>
		<th>고용날짜</th>
		<td>
			<input type="text" name="hiredate" maxlength="30"  size="30" value="${b.hiredate}" />
		</td>
	</tr>
	
	<tr>
		<th>mgr</th>
		<td>
			<input type="text" name="mgr" maxlength="50" size="65" value="${b.mgr}" />
		</td>
	</tr>
	<tr>
		<th>월급</th>
		<td>
			<input type="text" name="sal" maxlength="50" size="65" value="${b.sal}" />
	</td>
	</tr>
		<tr>
		<th>comm</th>
		<td>
			<input type="text" name="comm" maxlength="50" size="65" value="${b.comm}" />
	</td>
	</tr>
		<tr>
		<th>부서번호</th>
		<td>
			<input type="text" name="deptno" maxlength="50" size="65" value="${b.deptno}" />
	</td>
	</tr>
	<tr>
		
		<td colspan="2">
			<input type="submit" value="수정"/>
			<input type="reset" value="취소" />
		</td>
	</tr>
	

</table>


</form>


</body>
</html>