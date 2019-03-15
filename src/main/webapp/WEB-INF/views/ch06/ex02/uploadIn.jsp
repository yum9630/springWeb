<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>
//버튼별 handler를 등록한다.
var regButtons = function(){
	$(":button# send").bind("click", function(){
		var formData = new FormData($("form")[0]);
		$.ajax({
			method:"post",
			data: formData,
			processData: false, //no serialize
			contextType: false, //multipart/formdata
			success: function(result){
				if(result)$("#msgModal #msg").text("업로드 성공");
			},
			error: function(a, b, errMsg){
				$("#msgModal #msg").text("업로드 실패: " + errMsg);
			},
			complete: function(){
				$("#msgModal").modal("show");
			}
		});
	});
};

$(document).ready(
		function(){
			regButtons();
		}
);

var imgView = function(input){
	if(input.files && input.files[0]){
		var reader = new FileReader();
		reader.addEventListener("load", function(){
			$('.previewImg').attr('src', reader.result);
		}, false);
		reader.readAsDataURL(input.files[0]);
	}
}
</script>

<div>
	<img class="previewImg" align="left" hspace="72" width="200" height="250">
</div>
<form>
	<input type="file" id="uploadFile" name="uploadFile" onChange="imgView(this)">
</form>
<button type="button" id="send" class="button btn-default">업로드</button>

<div id="msgModal" class="modal fade">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body">
				<p id="msg">수정 성공</p>
			</div>
			<div class="modal-body">
				<button type="button" class="close" data-dismiss="modal">확인</button>
			</div>
		</div>
	</div>
</div>