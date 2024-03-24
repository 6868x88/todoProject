<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css.css" rel="stylesheet" type="text/css">
<title>TODO LIST</title>
</head>

<body>
	<div class="todo_body">
		<div class="container">
			<div class="todo_title">내가 해낸다 !</div>
			<hr class="hr-1">
			<form action="/todo/newTodo.do" method="get">
				<c:set var="tododate" value="<%=new java.util.Date()%>" />
				<fmt:formatDate var="today" value="${tododate}" pattern="yyyy-MM-dd"
					type="date" />
				<div class="add">
					✏️ <input name="content" type="text" placeholder="일정 추가"> 
					   <input type="hidden" name="tododate" value="${today }" />
					<button type="submit" class="addList">+</button>
				</div>

				<!--날짜-->
				<div class="date">
					<label>오늘 날짜:</label> <label> <c:out value="${today }" />
					</label>
				</div>
			</form>


			<!--일정 목록-->
			<div class="content">
				<!--일정 리스트-->
				<c:forEach var="contents" items="${todoList}">
					<ul style="padding-left: 20px;">
						<li class="content-li check"><input type="checkbox"></li>
						<li class="content-li">${contents.content }
							<hr class="hr-2">
						</li>
						<li class="content-li del">
							<button class="del" onclick="deleteItem([[${contents.idx}]])">
								<img class="del_img" src="Untitled-3.png">
							</button>
						</li>
					</ul>
				</c:forEach>


			</div>

			<!--결과-->
			<div class="result">
				<hr class="hr-1">
				<span style="font-size: 20px;">오늘의 나는 。。。。</span>
				<div>
					<input name="todo_result" type="radio"> <img
						src="Untitled-1.png" width="150px"> <input
						name="todo_result" type="radio"> <img src="Untitled-2.png"
						width="150px">
				</div>
			</div>
		</div>
	</div>
</body>


<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
function deleteItem(idx){
    console.log(idx)
    const url = "/todo/delete.do?idx="+idx
    $.ajax({
        type:'get',
        url:url,
        contentType:'application/json; charset=utf-8'
        }).done(function() {
        alert('할일을 삭제했습니다.');
        window.location.href = '/';
        }).fail(function (error){
        alert(JSON.stringify(error));
        });
       }
</script>

</html>