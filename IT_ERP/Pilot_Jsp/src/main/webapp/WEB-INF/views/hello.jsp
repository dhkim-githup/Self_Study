<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: SAJ09210004
  Date: 2022-12-12
  Time: 오후 3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String strParam = request.getParameter("param");
    String strWellcome = (String) request.getAttribute("welcome");
    List<Map<String, Objects>> list = (List) request.getAttribute("list");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
<div id="hello">
    파라메터 : <label> - <%=strParam%></label><p>
    Welcome - JSP : <label>Hello World - <%=strWellcome%></label>

</div>

<hr>

<div id="list">
    <table>
        <tr>
            <th>No</th>
            <th>이름</th>
            <th>나이</th>
            <th>등록일</th>
        </tr>

        <tr>
            <td>No</td>
            <td>이름</td>
            <td>나이</td>
            <td>등록일</td>
        </tr>

        <% for(Map map : list){ %>
        <tr>
            <td>No</td>
            <td><%=map.get("name")%></td>
            <td><%=map.get("age")%></td>
            <td><%=map.get("reg_day")%></td>
        </tr>
        <% } %>

    </table>

</div>
</body>
</html>