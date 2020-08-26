<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getData2View.jsp</title>
</head>
<body>
	getData3View.jsp
	
	<br><hr><br>
	1. 요청 객체에 저장된 새로운 데이터 출력  <br>
	&nbsp;&nbsp; ${requestScope.msg} <br><br>
	
	2. web query string으로 전송된 데이터  <br>
	&nbsp;&nbsp; 아이디 : ${param.id} - 나이 : ${param.age}<br><br>
	
	
	3. 자동 생성된 Customer DTO에 저장된 데이터 <br>
	&nbsp;&nbsp; 아이디 :  ${requestScope.cust.id} - 나이 : ${requestScope.cust.age} <br><br>
	
	<br><hr><br>
	<a href="${pageContext.request.contextPath}/step01Index.html">메인 화면으로 이동 </a>
		
</body>
</html>