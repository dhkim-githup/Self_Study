<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

/* 생각해보니  신기하게도 jsp 는 그 자체로 , HttpServlet 을 상속받나 봐요.. */

String  userName  = request.getParameter("input_name"); 
int     userAge   = Integer.parseInt(request.getParameter("input_age")); 
String userMobile = request.getParameter("input_mobile");


%>

<html>
<head>
<meta charset="UTF-8">
<title>새로운 회원을 맞이하세</title>
</head>
<body>
<a href="/index.html">[Go Home]</a>
<p>
package com.study.mvc.ver1;<br>
/WEB-INF/views/mvc/servletJoin_ver1_result.jsp<br>
환영합니다. <p>

이름 : <%=userName %><br>
나이 : <%=userAge %><br>
모바일 : <%=userMobile %>

</body>
</html>