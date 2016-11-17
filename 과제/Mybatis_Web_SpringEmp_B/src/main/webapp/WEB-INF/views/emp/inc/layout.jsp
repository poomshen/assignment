<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Theme CSS -->
<link href="css/freelancer.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
	
<body>
	<!-- Header  영역  -->
	<tiles:insertAttribute name="header" />
	<!-- Main영역  -->
	<br>
	<br>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
						<!-- Content (실내용) -->
						<tiles:insertAttribute name="content" />
				</div>
			</div>
		</div>
	<!-- Footer 영역 -->
	<tiles:insertAttribute name="footer" />
</body>
</html>