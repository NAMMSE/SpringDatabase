<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��� ���� ���</title>
<!-- 0810 ����� -->
</head>
<body>

	<h3>���ڵ�</h3>
	<ul>
		<c:forEach items="${pizzas }" var="pizza">
			<li>${pizza }</li>
			(<a href="update?id=${pizza.id }">����</a> / 
			<a href="delete?id=${pizza.id }">����</a>)
		</c:forEach>
	</ul>
	
	<a href="<c:url value="/pizza/add" />">�� ���� �߰��ϱ�</a>
	
	
</body>
</html>