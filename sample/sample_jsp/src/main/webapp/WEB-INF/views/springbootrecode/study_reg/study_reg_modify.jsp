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
    Vo_study vo_study = (Vo_study) request.getAttribute("voStudy");
    String strFlag = (String) request.getAttribute("flag");
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
<body class="text-center">


<!-- 헤더 위치 -->
<%@ include file="/WEB-INF/views/springbootrecode/comm/header.jsp"%>

<main>
    <form name="frm_study_modify" action="/springbootrecode/study_reg/modify_exec" method="post">
        <div class="container">
            <div class="row justify-content-md-center mb-3">
                <div class="col col-lg-1"> Key_Id  </div>
                <div class="col-md-auto"><input type="text" name="keyId" value="<%=vo_study.getKeyId()%>" readonly></div>
            </div>
            <div class="row justify-content-md-center mb-3">
                <div class="col col-lg-1"> 공부일자  </div>
                <div class="col-md-auto"><input type="text" name="studyDay" value="<%=vo_study.getStudyDay()%>"></div>
            </div>
            <div class="row justify-content-md-center mb-3">
                <div class="col col-lg-1"> 공부내용  </div>
                <div class="col-md-auto"><input type="text" name="contents" value="<%=vo_study.getContents()%>"></div>
            </div>
            <input type="hidden" name="flag" value="<%=strFlag%>">

            <% if("UP".equals(strFlag)){ %>
                <input class="btn btn-primary" type="submit" value="수정하기">
            <% }else if("IN".equals(strFlag)){ %>
                <input class="btn btn-primary" type="submit" value="등록하기">
            <% } %>
    </form>
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