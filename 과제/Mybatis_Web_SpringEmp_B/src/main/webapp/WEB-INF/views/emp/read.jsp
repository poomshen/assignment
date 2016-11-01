<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	th { text-align: left ; background:orange;}
	textarea { background-color: #ddd; border:1px solid blick;}
</style>
<script type="text/javascript">
 function emp_update(){
	//alert("수정");
	location.href="updateform.htm?empno=${emp.empno}";
	
}
function emp_delete(){
	//alert("삭제");
	location.href="delete.htm?empno=${emp.empno}";
}
 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 읽기</title>
</head>
<body>
<h1>글 읽기</h1>

<a href="list.htm?"> 리스트 </a>
<table width="500">

	<tr>		
		<th colspan="4">
			${emp.empno}
		</th>
	</tr>
	
	<tr>
		<td width="20%"><!-- 이름 -->${emp.ename}</td>
		<td width="20%"><!-- 이름 -->${emp.job}</td>
		
		<td width="20%"><!-- 이름 -->${emp.mgr}</td>
		
		<td width="20%"><!-- 이름 -->${emp.hiredate}</td>
		
		<td width="20%"><!-- 이름 -->${emp.sal}</td>
		
		<td width="20%"><!-- 이름 -->${emp.comm}</td>
		
		<td width="20%"><!-- 이름 -->${emp.deptno}</td>
		
		</tr>
	
<tr>
		<td colspan="4" align="right">
			<input type="button" value="수정" onclick="emp_update()"/>
			<input type="button" value="삭제" onclick="emp_delete()" />
		</td>
	</tr>
	
</table>



</body>
</html>