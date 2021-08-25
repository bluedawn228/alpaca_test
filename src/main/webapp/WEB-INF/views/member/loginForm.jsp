<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
<%--     <link rel="stylesheet" href="${contextPath}/resources/css/joinForm.css"> --%>
    <style type="text/css"></style>

</head>
<body>
<form action="/member/login" method="post" id="login">
	<article class="join">	
	    <h3>/</h3>
        <h3>/</h3>
        <h3>/</h3>
    <h3>인생을 바꾸는 교육,</h3> 
    <h3>국제공인 NLP코칭 사관학교</h3>
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" id="login_id" placeholder="아이디를 입력하세요" /></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password" id="login_pass" placeholder="비밀번호를 입력하세요"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="로그인" /></td>
		</tr>
	</table>
</form>
