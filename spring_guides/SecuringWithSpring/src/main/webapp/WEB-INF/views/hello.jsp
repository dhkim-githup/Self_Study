<%--
  Created by IntelliJ IDEA.
  User: SAJ09210004
  Date: 2022-06-27
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hello.jsp</title>
</head>
<body>
Hello.jsp

<form action="/logout" method="post">
    <input type="hidden"   name="${_csrf.parameterName}"  value="${_csrf.token}"/>
    <input type="submit" value="Sign Out"/>

</form>

</body>
</html>
