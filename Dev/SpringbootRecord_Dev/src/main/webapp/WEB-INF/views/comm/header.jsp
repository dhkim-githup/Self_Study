<%--
 헤더 파일
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String strLoginId="guest";
    String strName="guest";
    String strRole="";

    String strLoginOut="";
    String strLoginUrl="";

    session = request.getSession(false);
    if (session != null) {
        strLoginId = (String) session.getAttribute("ss_login_id");
        strName = (String) session.getAttribute("ss_name");
        strRole = (String) session.getAttribute("ss_role");

        strLoginOut= "LogOut";
        //strLoginUrl= "/login/logout"; // 커스텀 로그아웃
        strLoginUrl= "/logout"; // 스프링 시큐리티 Logout 사용
    }
    if(strLoginId==null) {
        strLoginId = "guest";
        strLoginOut= "Login";
        strLoginUrl= "/login/login";
    }
    if(strName==null) strName="guest";


%>

<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center py-3 mb-4 border-bottom">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/home" class="nav-link active" aria-current="page">Home(H)</a></li>
            <li class="nav-item"><a href="/study/list" class="nav-link">공부기록</a></li>
            <%// if ("ADMIN".equals(strRole)){ %>
            <li class="nav-item"><a href="/member/list" class="nav-link">회원목록</a></li>
            <%// } %>
            <li class="nav-item"><a href="#" class="nav-link">About</a></li>
        </ul>

        <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='<%=strLoginUrl%>'" ><%=strLoginOut%></button>
            <% if("guest".equals(strLoginId)){ %>
            <button type="button" class="btn btn-primary" onclick="location.href='/member/insert'">Sign-up</button>
            <% } %>
        </div>
    </header>
</div>