<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%     
	 String strName = request.getParameter("name");
	 out.println("send.jsp. name => "+ strName);       
	 
	 out.println("<p>");
	 
	 String strAge =(String) request.getAttribute("Age");
	 out.println("send.jsp. Age => "+ strAge);  
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p> Send.jsp 

</body>
</html>