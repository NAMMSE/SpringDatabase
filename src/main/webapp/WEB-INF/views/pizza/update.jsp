<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> 피자 정보 수정하기</title>
<!-- 0810 강사님 -->
</head>
<body>

	<h3> 새 피자 </h3>

<!-- ./add -->
<form action="update" method="POST">
	ID : <input name="id" value="${pizza.id }" readonly /><br />
	이름 : <input name="name" value="${pizza.name }" /><br />
	가격 : <input name="price" value="${pizza.price }"/><br />
	칼로리 : <input name="calrories" value="${pizza.calrories }"/><br />
	<input type="submit" value="수정하기"/>
</form>

</body>
</html>