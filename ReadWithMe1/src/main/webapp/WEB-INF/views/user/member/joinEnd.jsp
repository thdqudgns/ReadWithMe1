<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/WEB-INF/views/user/layout/header.jsp" />

<link href="/resources/css/findUser.css" rel="stylesheet">

<section>
<h1>가입 완료!</h1>
<div>가입이 성공적으로 완료되었습니다! Read With Me의 서비스를 정상적으로 이용하실 수 있습니다.<br>
시드니 스미스가 한 말 중 독서할 때 당신은 항상 가장 좋은 친구와 함께 있다. 라는 말이 있습니다. <br>
Read With Me는 회원님의 가장 좋은 친구가 되도록 노력하겠습니다!</div>

<div id="checkBtns" style="text-align: center;">
<a href="/login"><button class="checkBtn" style="background-color: #9f8170; color:#FFF;">로그인</button></a>
<a href="/"><button class="checkBtn">홈으로 가기</button></a>
</div>
</section>

<c:import url="/WEB-INF/views/user/layout/footer.jsp" />