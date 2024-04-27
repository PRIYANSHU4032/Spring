<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome to jsp....
	<form action="addAlien">
	Enter your id please : <input type="text" name="aid"><br>
	Enter your name: <input type="text" name="aname"><br>
	<input type="submit">
	</form>
	
	<form action="getAlien">
	<input type="submit" value="alien">
	</form><br>
	
	
	<form action="getoneAlien">
	Enter your id please : <input type="text" name="aid"><br>
	
	<input type="submit">
	</form>
	
	<form action="oneAlien">
	Enter your id please : <input type="text" name="aid"><br>
	
	<input type="submit">
	</form>
</body>
</html>