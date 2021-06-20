<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>   

<%
   //List<String> list = (ArrayList<String>)request.getAttribute("morning_coffee");	
   String strCoffee = (String) request.getAttribute("morning_coffee");
   

   //out.println("List Size : "+list.size());
%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    Good morning !! <br>
    Have a nice day ~<p>
	Morning Coffee : <%=strCoffee %>
	
</body>
</html>