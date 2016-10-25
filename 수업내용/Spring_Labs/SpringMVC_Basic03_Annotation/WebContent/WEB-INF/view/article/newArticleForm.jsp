<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		why : action="/article/newArticle.do" 을 명시하지 않았을까
		
		??
		중요 Key Point
		:http://localhost:8090/SrpingMVC_Basic03_Annotation/article/newArticle.do
		>Form 태그의 action 값이 없다면 현재 url 주소를 그대로
		>action 값으로 사용
	 -->
	<h3>게시판 글쓰기 입력 폼</h3>
	<form method="post">
		<input type="hidden" name="parentId" value="0">
		 제목:<input type="text" name="title"><br>
		 내용:<input type="text" name="content"><br>
		 <input type="submit" value="전송">
	</form>
</body>
</html>