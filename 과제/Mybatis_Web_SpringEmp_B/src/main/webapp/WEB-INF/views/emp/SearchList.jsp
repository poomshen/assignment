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
<h3>���ϰ˻��ϱ�</h3>
	<form action="searchs.htm?cmd=search" method="post">
		<select name="column">
			<option value="ename">�̸�</option>
			<option value="empno">�μ���ȣ</option>
			<option value="job">����</option>
		</select>
		<input type="text" name="keyvalue">
		<input type="submit" value="�˻�">
	</form>


<hr>
	<table border="1" width="600">
		<tr>
			<td>�̸�</td>
			<td>�μ���ȣ</td>
			<td>����</td>
			<td>����</td>
			<td>�Ŵ�����ȣ</td>
			<td>�Ի���</td>
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