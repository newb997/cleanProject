<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>

	<form action="login" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input name="p_id" id="userId">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="p_pw" id="userPw">
				</td>
			</tr>
		</table>
	<div class="buttons">
       	<input type="submit" value="로그인"  />
       	<input type="button" value="취소"  />
       </div>
	</form>
	
<script>
	<c:if test="${ loginfail != null }">
		alert("로그인 실패 : 아이디 또는 패스워드가 일치하지 않습니다.");
	</c:if>
</script>

</body>
</html>
