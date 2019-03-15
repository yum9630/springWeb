<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form method="post">
	<label>받는이: <input type="email" name="to"/></label><br>
	<label>제목: <input type="text" name="subject"/></label><br>
	<textarea cols="50" rows="10" name="txt"></textarea><br>
	<button type="submit">보내기</button>
</form>