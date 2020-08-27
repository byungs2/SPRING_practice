<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	세션의 데이터 확인하기 <br>
	이름 ${sessionScope.name} <br>
	나이 ${sessionScope.age} <br>
	직업 ${sessionScope.job} <br>
	
	<%-- HttpSession에 직접 job2 저장 및 활용 가능 --%>
	직업 ${sessionScope.job2} 
	
	<br><hr><br>
	<%--controller : 삭제 수행 -> sessionView1.jsp에서 확인 --%>
	세션 삭제 요청 <br>
	<a href="sessiontracking/sessionDataDelete1">1. HttpSession로 API 삭제</a> <br>
	<a href="sessiontracking/sessionDataDelete2">2. Spring API로 삭제</a> <br>
	
	
	
	<br><br><br>
	<a href="step03SessionTracking.jsp">메인으로 이동</a>
</body>
</html>