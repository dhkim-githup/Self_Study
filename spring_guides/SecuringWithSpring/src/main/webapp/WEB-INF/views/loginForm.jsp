<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>LoginForm</title>
</head>
<body>
<h1>loginForm.jsp-2</h1>

<form action="/login_security" method="post">

    ID : <input type="text" name="username" value="user"> <br />
    PW : <input type="password" name="password" value="password"> <br />
    <input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
    <input type="submit" value="LOGIN"> <br />

</form>

<p>
<a href="/login?username=user&password=password">loginGet</a>

</body>
</html>