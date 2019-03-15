<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("userId")==null){
%>
	<form method="post">
		<label>아이디: <input type="text" name="userId"></label><br>
		<label>암호: <input type="password" name="userPw"></label><br>
		<input type="submit"/>
	</form>
<%
	}else{
%>
	${userId}로 로그인하였습니다. <br>
	<a href="article">기사보기</a>
<%
	}
%>