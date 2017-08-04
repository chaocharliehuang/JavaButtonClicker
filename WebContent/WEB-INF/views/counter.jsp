<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Counter</title>
</head>
<body>
	<form action="/Counter" method="POST">
		<input type="submit" value="Click me!">
	</form>
	<p>You have clicked the button <c:out value="${count}"/> time(s)!</p>
</body>
</html>