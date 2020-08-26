<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	hello2View.jsp입니다<br> <br>
	
	ModelAndView에 저장된 데이터 출력 <br><hr><br>
	
	1. 요청 객체에 저장된 message : ${requestScope.message} <br>

	2. 요청 객체에 저장된 id : ${requestScope.id}<br>
	
	3. web query string으로 전송된 id : ${param.id} <br>
	
	<br><hr><br>
	<a href="${pageContext.request.contextPath}/step01Index.html">메인 화면으로 이동 </a>
		
</body>
</html>