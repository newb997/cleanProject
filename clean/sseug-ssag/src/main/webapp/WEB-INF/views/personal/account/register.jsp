<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>register</title>
</head>
<body>
<form:form method="post" action="register" modelAttribute="pMember">
	id <form:input  id="p_memberId" path="p_id" />
	pw <form:input id="p_memberPw" path="p_pw" type="password" />
	name <form:input id="p_memberName" path="p_name" />
	nickname <form:input id="p_memberNickname" path="p_nickname" />
	email <form:input id="p_memberEmail" path="p_email" type="email" />
	phone <form:input id="p_memberPhone" path="p_phone" />
	<input type="submit" value="회원가입">
</form:form>
</body>
</html>