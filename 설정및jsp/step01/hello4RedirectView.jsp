<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello1RedirectView.jsp</title>
</head>
<body>

	hello4RedirectView.jsp <br><br>
	
	<hr><br>
	
	${param.msg}
	
	<br><hr><br>
	<a href="${pageContext.request.contextPath}/step01Index.html">메인 화면으로 이동 </a>
</body>
</html>