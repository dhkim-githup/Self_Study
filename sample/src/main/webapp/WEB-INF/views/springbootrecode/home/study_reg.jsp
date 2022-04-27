<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.example.sample.springbootrecode.vo.Vo_study" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2022-04-22
  Time: 오후 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
   // List<Map<String, String>> list = (List<Map<String, String>>) request.getAttribute("study");
    List<Vo_study> list = (List<Vo_study>) request.getAttribute("list");
%>

<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Home!</title>
</head>
<body>


<!-- 헤더 위치 -->
<%@ include file="/WEB-INF/views/springbootrecode/comm/header.jsp"%>


<main>
    <div class="container">
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
            <button class="btn btn-primary me-md-2" type="button">등록하기</button>
        </div>
        <div class="row mb-3 bg-secondary text-white">
            <div class="col">KEY_ID(Vo)</div>
            <div class="col">공부일자</div>
            <div class="col">공부내용</div>
            <div class="col">등록일자</div>
            <div class="col">삭제</div>
        </div>
        <% // for(Map<String, String> map : list){
           for(Vo_study vo_study : list){
        %>
            <div class="row mb-2">
                <div class="col"><%= vo_study.getKeyId()  %></div>
                <div class="col"><%= vo_study.getStudyDay()  %></div>
                <div class="col"><%= vo_study.getContents()  %></div>
                <div class="col"><%= vo_study.getRegDay()  %></div>
                <div class="col"><a href="/springbootrecode/home/IdDelete?key_id=<%=vo_study.getKeyId() %>">삭제</a></div>
            </div>
        <% } %>

    </div>

</main>

<!-- 푸터 위치 -->
<%@ include file="/WEB-INF/views/springbootrecode/comm/footer.jsp"%>


<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
-->


</body>
</html>