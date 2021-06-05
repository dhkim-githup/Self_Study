<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="beans.PersonBean"  %>
<%
/* 첫번째 , page import 하여 사용하기 */
	PersonBean personBean = new PersonBean();

	personBean.setName("홍길동");
	personBean.setAge(20);
	
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 이름 : <%=personBean.getName() %> </h1>
<h1> 나이 : <%=personBean.getAge() %> </h1>

</body>
</html>