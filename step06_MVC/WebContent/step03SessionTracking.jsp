<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%  
	//쿠키 테스트를 위한 설정
	Cookie c = new Cookie("id", "cookieMan");
	c.setMaxAge(60*60);
	response.addCookie(c);
	
	//세션 테스트를 위한 설정
	session.setAttribute("name", "sessionMan");
	session.setAttribute("age", 29); //new Integer(29)
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a {
		text-decoration: none;
	}
</style>

</head>
<body>
	
	<h2>Spring 기반의 상태 유지 기술</h2>
	<br><hr><br>
	
	* test를 위한 쿠키와 세션 데이터는 해당 jsp에서 저장했음 <br>	
	

	<br><hr><br>
	<h3>[1] Cookie API 활용</h3>
	<a href="sessiontracking/cookietest">1.sessiontracking/cookietest & @CookieValue</a>
	
	<br><hr><br>
	<h3>[2] HttpSession API 활용</h3>
	<a href="sessiontracking/sessionTest1">2-1. HttpSession API 활용 </a>
	
	<br><br>
	<a href="sessiontracking/sessionTest2">2-2. @SessionAttributes 이해하기 </a>
	
	<br><br>
	
	<a href="sessiontracking/sessionTest3DTO?name2=LBH&age2=20">2-3. DTO 객체를 세션에 저장(name, age 데이터 전송)</a>
	
</body>
</html>