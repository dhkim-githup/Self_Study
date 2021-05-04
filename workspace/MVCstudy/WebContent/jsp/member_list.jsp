<%@page import="com.study.comm.vo.Members"%>
<%@page import="com.study.comm.repository.Repository_member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.study.comm.*, java.util.*" %>
        
<!DOCTYPE html>

<%

	/* Repository_member 객체를 얻어온다 , Members 에 있는 값을 가져와야 함. */
	Repository_member repository_member = new Repository_member();
	
	// 리스트에 멤버변수를 담는다.
	List<Members> list = repository_member.getList();


%>

<html>
<head>
<meta charset="UTF-8">
<title>새로운 회원을 맞이하세</title>
</head>
<body>
<a href="/index.html">[Go Home]</a>
<p>
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