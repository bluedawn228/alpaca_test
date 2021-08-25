<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<link rel="icon" type="image/png" href="imgs/favicon.png" />
<link
  href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700&display=swap"
  rel="stylesheet"
/>

<link rel="stylesheet" href="${contextPath}/resources/css/header.css">
<script src="${contextPath}/resources/js/main.js" defer></script>
<script
  src="https://kit.fontawesome.com/9eb162ac0d.js"
  crossorigin="anonymous"
></script>
</head>



<body>

    <!-- Navbar -->
    <nav id="navbar">
      <div class="navbar__logo">
        <i class="fas fa-graduation-cap"></i>
        <a onclick="location='/'">국제공인 NLP코칭 사관학교</a>
      </div>
      <ul class="navbar__menu">
        <li class="navbar__menu__item active" 
        onclick="location='/'"
        data-link="#home">홈</li>
        <li class="navbar__menu__item" data-link="#intro">소개</li>
        <li class="navbar__menu__item" data-link="#lecture">강의</li>
        <li class="navbar__menu__item" data-link="#testimonials">후기</li>
        <li class="navbar__menu__item" data-link="#contact">문의</li>
      </ul>
      
<a href="/member/join">회원가입</a>         

<c:choose>
	<c:when test="${id eq null }">
		<a href="/member/login">로그인</a>
	</c:when>
	
	<c:otherwise>
		<a href="/member/logout">로그아웃</a>
	</c:otherwise>
</c:choose>

      
<!--       <ul class="navbar__member">
        <li class="navbar__member__item">회원가입</li>
        <li class="navbar__member__item">로그인</li>
      </ul> -->
      
      <!-- Toggle button -->
      <button class="navbar__toggle-btn">
        <i class="fas fa-bars"></i>
      </button>
    </nav>

    <!-- Arrow up -->
    <button class="arrow-up">
      <i class="fas fa-arrow-up"></i>
    </button>

</body>
</html>