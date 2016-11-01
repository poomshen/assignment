<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 쓰기</title>
<!-- <script type="text/javascript">
	function board_write(){
		//alert("쓰기")	;
		if(document.writeform.name.value==""){
			alert("이름을 입력해주세요");
		}else if(document.writeform.pwd.value==""){
			alert("비밀번호을 입력해주세요");
			document.writeform.pwd.focus();
		}else if(document.writeform.email.value==""){
			alert("이메일을 입력해주세요");
			document.writeform.email.focus();
		}else if(document.writeform.subject.value==""){
			alert("제목을 입력해주세요");
			document.writeform.subject.focus();
		}else if(document.writeform.content.value==""){
			alert("내용을 입력해주세요");
			document.writeform.content.focus();
		}else{
			document.writeform.submit(); //전송
		}
	}
</script> -->
<style type="text/css">
	th {text-align: right; background: orange}

</style>

</head>
<body>
<h1>글 쓰기</h1>
<a href="list.htm">리스트</a>
<form name = "writeform" action="write.htm" method="post">
<table width="600">
	<tr>
		<th>사번</th>
		<td>
			<input type="text" name="empno" maxlength="5" size="12"/>
		</td>
	</tr>
	
	<tr>
		<th>이름</th>
		<td>
			<input type="text" name="ename" maxlength="12"  size="13"/>
		</td>
	</tr>
	<tr>
		<th>직종</th>
		<td>
			<input type="text" name="job" maxlength="30"  size="30"/>
		</td>
	</tr>
	
	
	<tr>
		<th>mgr</th>
		<td>
			<input type="text" name="mgr" maxlength="50" size="65"/>
		</td>
	</tr>

		<tr>
		<th>월급</th>
		<td>
			<input type="text" name="sal" maxlength="50" size="65"/>
		</td>
	</tr>
		<tr>
		<th>comm</th>
		<td>
			<input type="text" name="comm" maxlength="50" size="65"/>
		</td>
	</tr>
		<tr>
		<th>부서번호</th>
		<td>
			<input type="text" name="deptno" maxlength="50" size="65"/>
		</td>
	</tr>
	<tr><!-- 
	 onclick="board_write()" -->
		<td colspan="2">
			<input type="submit" value="등록"/>
			<input type="reset" value="취소" />
		</td>
	</tr>
	

</table>


</form>
</body>
</html>