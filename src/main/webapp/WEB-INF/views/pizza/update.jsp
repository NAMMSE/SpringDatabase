<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> ���� ���� �����ϱ�</title>
<!-- 0810 ����� -->
</head>
<body>

	<h3> �� ���� </h3>

<!-- ./add -->
<form action="update" method="POST">
	ID : <input name="id" value="${pizza.id }" readonly /><br />
	�̸� : <input name="name" value="${pizza.name }" /><br />
	���� : <input name="price" value="${pizza.price }"/><br />
	Į�θ� : <input name="calrories" value="${pizza.calrories }"/><br />
	<input type="submit" value="�����ϱ�"/>
</form>

</body>
</html>