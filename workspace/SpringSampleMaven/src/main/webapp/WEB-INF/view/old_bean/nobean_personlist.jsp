<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.study.demo._team.old_bean.nobean_vo.PersonVo"%>
<%@page import="java.util.List"%>   

<%
   List<PersonVo> list = (ArrayList<PersonVo>)request.getAttribute("personList");	

   out.println("List Size : "+list.size());
%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Person List 1 Jsp
	
<table>
		 <tr>		
		 <th>Name</th>
		 <th>Age</th>
		 </tr>	
<%  for (PersonVo p : list) { %>
		<tr>
		<td><%=p.getName() %></td>
		<td><%=p.getAge() %></td>
		</tr>
<% } %>
</table>	
	
</body>
</html>