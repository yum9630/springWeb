<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script>
//버튼별 handler를 등록한다.
var regButtons = function(){
	$("#good").bind("click", function(){
		$("#msg").text("Good, click");
		$.ajax({
			method: "GET",
			url: "x/good",
			success : function(cnt){
				$("#msg").text(cnt);
			}
		});
	});
	
	$("#bad").bind("click", function(){
		$("#msg").text("Bad, click");
		$.ajax({
			method: "GET",
			url: "x/bad",
			success: function(cnt){
				$("#msg").text(cnt);
			},
			error: function(a, b, errMsg){
				$("#msg").text("실패: " + errMsg);
			}
		});
	});
	
	$("#badWithX").bind("click", function(){
		$("#msg").text("BadWithX, click");
		$.ajax({
			method: "GET",
			url: "x/badWithX",
			success: function(cnt){
				$("#msg").text(cnt);
				listNums();
			},
			error: function(a, b, errMsg){
				$("#msg").text("실패: " + errMsg);
			}
		});
	});
};
$(document).ready(
	function(){
		regButtons();
});
</script>

<title>Transaction</title>
<p></p>
<button type="button" id="good">Good</button>
<button type="button" id="bad">bad no X</button>
<button type="button" id="badWithX">bad with X</button>
<p id="msg"></p>