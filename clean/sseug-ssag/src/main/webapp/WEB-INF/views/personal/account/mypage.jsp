<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#div1 {
		width:50%;
		margin: 0 auto;
	}
	#table1 {
		width:50%;
		border: 1px solid;
        text-align: center;
        border-collapse: collapse;
	}
	td {
		border: 1px solid;
		border-collapse: collapse;
	}
</style>
</head>
<body>

	<div align="center" id="div1">
		<form action="mypage" method="get">
			<h1>마이페이지</h1>
			<table id="table1">
				<tr>
					<td>ID</td>
					<td>${ loginPuser.p_id }</td>
				</tr>
				<tr>
					<td>NAME</td>
					<td>${ loginPuser.p_name }</td>
				</tr>
				<tr>
					<td>NICKNAME</td>
					<td>${ loginPuser.p_nickname }</td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td>${ loginPuser.p_email }</td>
				</tr>
				<tr>
					<td>PHONE</td>
					<td>${ loginPuser.p_phone }</td>
				</tr>
				<tr>
					<td>가입일</td>
					<td><fmt:formatDate value="${ loginPuser.p_regdate }" pattern="yyyy-MM-dd"/></td>
				</tr>
			</table>
		</form>
		<div>
			<button onclick="">정보수정</button>
			<button onclick="">회원탈퇴</button>
		</div>
	</div>
	
</body>
</html>