<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello1RedirectView.jsp</title>
</head>
<body>

	hello1RedirectView.jsp <br><br>
	
	<hr><br>
	redirect로 Spring 거치지 않고 바로 실행시키는 jsp <br>
	
	
	<br><hr><br>
	<a href="${pageContext.request.contextPath}/step01Index.html">메인 화면으로 이동 </a>
</body>
</html>