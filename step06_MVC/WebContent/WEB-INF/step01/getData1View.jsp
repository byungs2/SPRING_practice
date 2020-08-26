<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getData1View.jsp</title>
</head>
<body>
	getData1View.jsp 
	
	<br><hr><br>
	web query string으로 전송된 데이터 <br><br>
	
	아이디 : ${param.id} - 나이 : ${param.age}<br><br>
	
	<br><hr><br>
	<a href="${pageContext.request.contextPath}/step01Index.html">메인 화면으로 이동 </a>
	
</body>
</html>