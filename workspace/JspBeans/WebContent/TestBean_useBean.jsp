<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="personBean" class="beans.PersonBean" scope="page" />
<%
/* 두번째 , useBean 사용하기, 위 구문은 import 와 생성자를 동시 생성함 */
	
    //PersonBean personBean = new PersonBean();

	personBean.setName("홍길순");
	personBean.setAge(30);
	
	out.println("Name : "+ personBean.getName());
	out.println("Age  : "+ personBean.getAge());
%>

<!--  setProperty 사용  -->
<jsp:setProperty name="personBean" property="name" value="홍길남" />
<jsp:setProperty name="personBean" property="age" value="40" />


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 이름 : <%=personBean.getName() %> </h1>
<h1> 나이 : <%=personBean.getAge() %> </h1>

<!--  getProperty 사용  -->
<jsp:getProperty property="name" name="personBean"/>
<jsp:getProperty property="age" name="personBean"/>


</body>
</html>