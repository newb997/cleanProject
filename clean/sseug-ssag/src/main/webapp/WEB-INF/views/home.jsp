<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<style type="text/css">
	a {
		text-decoration: none;
		color: black;
	}
</style>
</head>
<body>
	<div class="ml-auto">

		<c:choose>
			<c:when test="${empty loginPuser}">
		        <a href="/sseug-ssag/account/register">회원가입</a>&emsp;
				<a href="/sseug-ssag/account/login">로그인</a>
			</c:when>
			<c:otherwise>
				<p>[ ${ loginPuser.getP_id() }님 환영합니다]</p>
				<a href="/sseug-ssag/account/mypage">마이페이지</a>&emsp;
				<a href="/sseug-ssag/account/logout">로그아웃</a>
			</c:otherwise>
		</c:choose>
   		  	
    </div>
    
<!-- <div id="login"> -->
<%-- 	<c:if test="${ empty loginPuser }"> --%>
<%-- 	</c:if> --%>
<%-- 	<c:if test="${ !empty loginPuser }"> --%>
<%-- 		<p>[ ${ loginPuser.getP_id() }님 로그인 상태]</p> --%>
<%-- 	</c:if> --%>
<!-- </div> -->

</body>
</html>