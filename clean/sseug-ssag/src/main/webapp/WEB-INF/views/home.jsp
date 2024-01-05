<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<div class="ml-auto">
        <a href="/sseug-ssag/account/register" style="color: inherit;">
            <span class="mb-0 text font-weight-bold">회원가입</span>
        </a><br>
        
        <a href="/sseug-ssag/account/login" style="color: inherit;">
            <span class="mb-0 text font-weight-bold">로그인</span>
        </a>
        
		<c:choose>
			<c:when test="${empty loginPuser}">
				<li><a href="/sseug-ssag/account/login">로그인</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="/sseug-ssag/account/logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
   		  	
    </div>
    
<div id="login">
	<c:if test="${ empty loginPuser }">
	</c:if>
	<c:if test="${ !empty loginPuser }">
		<p>[ ${ loginPuser.getP_id() }님 로그인 상태]</p>
	</c:if>
</div>

</body>
</html>