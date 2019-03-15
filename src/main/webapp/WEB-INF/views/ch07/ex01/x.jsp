<%@ page language="java" contentType="text/html;charset=utf-8" 
pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script>
//현재 일시를 표시한다.
var showDate=function(){
   var date=new Date();
   $("#current").html(
         date.getFullYear()+"/"+(date.getMonth()+1)+"/"
         +date.getDate()+" "+date.getHours()+":"
         +date.getMinutes()+":"+date.getSeconds()
   );   
};

//버튼별 handler를 등록한다.
var regButtons=function(){
   $(":button#good").bind("click",function(){
      $("#msg").text("Good, click");
      $.ajax({
         method:"GET",
         url:"x/good",
         success:function(rowCnt){
            $("#msg").text(rowCnt+"건 처리.");
            listNums();
         }
      });
   });
   
   $(":button#badWithX").bind("click",function(){
      $("#msg").text("BadWithX, click");
      $.ajax({
         method:"GET",
         url:"x/badWithX",
         success:function(rowCnt){
            $("#msg").text(rowCnt+"건 처리")
            listNums();
         },
         error:function(a,b,errMsg){
            $("#msg").text("실패:"+errMsg);
         }
      });
   });
   $(":button#badNoX").bind("click",function(){
      $("#msg").text("BadNoX,click");
      $.ajax({
         method:"GET",
         url:"x/badNoX",
         success:function(rowCnt){
            $("#msg").text(rowCnt+"건 처리");
            listNums();
         },
         error:function(a,b,errMsg){
            $("#msg").text("실패:"+errMsg);
         }
      });
   });
   $(":button#badService").bind("click",function(){
      $("#msg").text("BadService,click");
      $.ajax({
         method:"GET",
         url:"x/badService",
         success:function(rowCnt){
            $("#msg").text(rowCnt+"건 처리");
            listNums();
         },
         error:function(a,b,errMsg){
            $("#msg").text("실패:"+errMsg);
         }
      });
   });
   $(":button#listNums").bind("click",function(){
      $("#msg").text("ListNums, click");
      listNums();
   });
};
var listNums=function(){
   $.ajax({
      method:"GET",
      url:"x/listNums",
      success:function(numList){
         $("ul").empty();
         $(numList).each(function(idx,num){
            $("ul").append("<li>"+num+"</li>");
         });
      }
   });
}
$(document).ready(
      function(){
         showDate();
         regButtons();
      }
);
</script>

<title>Transaction</title>
<p id="current"></p>

<button type="button" id="good">Good</button>
<button type="button" id="badWithX">BadWithX</button>
<button type="button" id="badNoX">BadNoX</button>
<button type="button" id="badService">BadServiceWithX</button>
<button type="button" id="listNums">ListNums</button>

<p id="msg"></p>

<ul></ul>