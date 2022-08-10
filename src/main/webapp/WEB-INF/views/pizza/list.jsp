<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>모든 피자 목록</title>
<!-- 0810 강사님 -->
</head>
<body>

	<h3>피자들</h3>
	<ul>
		<c:forEach items="${pizzas }" var="pizza">
			<li>${pizza }</li>
			(<a href="update?id=${pizza.id }">수정</a> / 
			<a href="delete?id=${pizza.id }">삭제</a>)
		</c:forEach>
	</ul>
	
	<a href="<c:url value="/pizza/add" />">새 피자 추가하기</a>
	
	
</body>
</html>