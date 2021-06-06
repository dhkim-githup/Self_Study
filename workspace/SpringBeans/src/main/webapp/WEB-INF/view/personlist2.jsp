<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.study.beans.okbean.vo.PersonVo2"%>
<%@page import="java.util.List"%>   

<%
   List<PersonVo2> list = (ArrayList<PersonVo2>)request.getAttribute("personList2");	

   out.println("List Size : "+list.size());
%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Person List Jsp
	
<table>
		 <tr>		
		 <th>Name</th>
		 <th>Age</th>
		 </tr>	
<%  for (PersonVo2 p : list) { %>
		<tr>
		<td><%=p.getName() %></td>
		<td><%=p.getAge() %></td>
		</tr>
<% } %>
</table>	
	
</body>
</html>