<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>새 피자 추가하기</title>
<!-- 0810 강사님 -->
</head>
<body>

	<h3> 새 피자 </h3>

<!-- ./add -->
<form action="add" method="POST">
	이름 : <input name="name" /><br />
	가격 : <input name="price" /><br />
	칼로리 : <input name="calrories" /><br />
	<input type="submit" />
</form>

</body>
</html>