<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri= "http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th> CustID </th>
			<th> Alias_id </th>
			<th> 이름 </th>
			<th> 핸드폰번호 </th>
			<th> 전화번호 </th>
			<th> 등록일자 </th>
		</tr>
		
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.cust_id }</td>
				<td>${list.alias_id}</td>
				<td>${list.cust_nm }</td>
				<td>${list.mcom_num }</td>
				<td>${list.tel_num }</td>
				<td>${list.reg_dati }</td>				
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>