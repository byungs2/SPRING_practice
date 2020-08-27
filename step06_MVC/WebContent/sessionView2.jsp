<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.cust.name2}<br>
	세션 삭제 요청 <br>
	<a href="sessiontracking/sessionDataDelete3">2. Spring API로 삭제</a> <br>
	<a href="step03SessionTracking.jsp">main Page</a>
</body>
</html>