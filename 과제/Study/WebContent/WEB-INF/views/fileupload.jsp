<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>



<body>
	<br><br>
	<form class="form-horizontal" action="fileupload.htm" method="post" enctype="multipart/form-data" >
		 <label class="col-sm-2 control-label">제목 :</label>
		 <div class="col-sm-10">
		  <input class="form-control" id="focusedInput" type="text" name="title"><br>
		   </div>
		 <label class="col-sm-2 control-label">파일 :</label>
		<div class="col-sm-10">  
		
		<input class="btn btn-info" type="file" name="file" >
		
		</div>
		<br><br><br><br>
		<label class="col-sm-3 control-label" >
		<input class="btn btn-info" type="submit" value="전송">
		</label>
	</form>

</body>
</html>