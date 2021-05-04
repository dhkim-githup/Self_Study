<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.study.comm.vo.Members"%>
<%@ page import="com.study.comm.repository.Repository_member"%>
<%@ page import=" java.util.*" %>

        
<!DOCTYPE html>

<%
		
		List<Members> list = (ArrayList<Members>)request.getAttribute("member");	
		
		out.println("List Size : "+list.size());	
		
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
/WEB-INF/views/mvc/servlet_ver1_list.jsp<br>
환영합니다. <p>
<table>
		 <tr>		
		 <th>Name</th>
		 <th>Age</th>
		 <th>Mobile</th>
		 </tr>	
<%  for (Members members : list) { %>
		<tr>
		<td><%=members.getStrName() %></td>
		<td><%=members.getIntAge() %></td>
		<td><%=members.getStrMobile() %></td>
		</tr>
<% } %>
</table>

</body>
</html>