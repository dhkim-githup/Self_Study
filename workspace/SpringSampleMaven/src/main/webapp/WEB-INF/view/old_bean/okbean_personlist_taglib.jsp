<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Person List Jsp 3 taglib - PersonService3
	
<table>
		 <tr>		
		 <th>Name</th>
		 <th>Age</th>
		 </tr>	
<c:forEach var="n" items="${personList3}">
		<tr>
		<td>${n.getName()}</td>
		<td>${n.getAge()}</td>
		</tr>
</c:forEach>		

</table>	
	
</body>
</html>