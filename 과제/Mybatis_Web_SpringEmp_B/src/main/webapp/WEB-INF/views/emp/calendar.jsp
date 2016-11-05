<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- calendar -->
<script src='fullcalendar/js/lib/jquery.min.js'></script>
<link href='fullcalendar/css/fullcalendar.css' rel='stylesheet' />
<link href='fullcalendar/css/fullcalendar.print.css' rel='stylesheet' media='print' />
<link href='fullcalendar/css/jquery-ui.min.css' rel='stylesheet' />
<script src='fullcalendar/js/lib/moment.min.js'></script>
<script src='fullcalendar/js/fullcalendar.min.js'></script>

<script>

	$(document).ready(function() {
		$('#calendar').fullCalendar({
			theme: true,
			defaultDate: '2016-11-03',
			editable: true,
			eventLimit: false, // allow "more" link when too many events
			selectable: true,
			selectHelper: true,
			
			
			
			
			
			// 작업자: 이명철  // 최근 수정일: 16-11-05 ---------------------S T A R T------------------------
			// 작업내용: 드래그로 일정등록 하는 내용 소스 분석 중
			
			select: function(start, end){				
				// prompt 함수 : alert가 input태그처럼 뜸, 거기서 확인을 누르면  return true, 취소를 누르면 retrun false임
				//             -> 그래서 if 조건문에 들어감! 개 신기방기함
				var title = prompt('제목 : ');
				var eventData;
				
				// start. end : 드래그할 때 시작일과, 종료일을 parameter로 받아 오는 듯!
					eventData= {
						title: title,
						start: start,
						end: end
					};
					//'renderEvent' 값이면, events들을 새로 불러와서 띄워줌!
					$('#calendar').fullCalendar('renderEvent', eventData, true);
					//'unselect' 값이면, events들에 변화를 안줌
					//$('#calendar').fullCalendar('unselect');
			},
				
			// 작업자: 이명철  // 최근 수정일: 16-11-05 --------------------- E N D ------------------------
			
			
			
			
			
			
			// 작업자: 이명철  // 최근 수정일: 16-11-05 ---------------------S T A R T------------------------
			// 작업내용: 일정 클릭했을 때 이벤트 발생 함수
				eventClick: function(calEvent, jsEvent, view) {

			        alert('Event: ' + calEvent.title); //일정의 정보 표현 ex) ~.title, ~.start, ~.end 값등 사용가능
			        alert('View: ' + view.name); //달력의 정보 표현 ex) view.name = november 2016, view.title = month
			        $(this).css('background-color', 'red'); //일정의 스타일을 바꿀 수 있음 ex) border-color, background-color ...
					
			    },
			 // 작업자: 이명철  // 최근 수정일: 16-11-05 --------------------- E N D ------------------------
			

			 
			 
				events: [
				{
					title: 'All Day Event',
					start: '2016-11-01'
				},
			]
		
		});
		
	});
	console.log('c')

</script>
<style>

	body {
		margin: 0px 0px;
		padding: 0;
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		font-size: 14px;
	}

	#calendar {
		max-width: 100%;
		margin: 0 auto;
	}

</style>
</head>
<body>
	<br><br><br><br>
	<div class="row">
	<div class="col-sm-7">
		<div id='calendar'>
		</div>
	</div>
		<div class="col-sm-5">
	ff
		<br> 여기에 업무 상세내용 들어갈거야
		</div>
	</div>
</body>
</html>