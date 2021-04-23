<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	
	String strName = request.getParameter("name");
	out.println("strName ="+strName);

	String strName2 = (String)request.getAttribute("name2");
	out.println("strName2 ="+strName2);

%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
/WEB-INF/views > test.jsp


</body>
</html>