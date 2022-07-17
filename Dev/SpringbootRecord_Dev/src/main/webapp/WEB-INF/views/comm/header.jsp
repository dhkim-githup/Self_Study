<%--
 헤더 파일
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center py-3 mb-4 border-bottom">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/home" class="nav-link active" aria-current="page">Home(H)</a></li>
            <li class="nav-item"><a href="/home/study_reg" class="nav-link">공부기록</a></li>
            <li class="nav-item"><a href="/member/list" class="nav-link">회원목록</a></li>
            <li class="nav-item"><a href="#" class="nav-link">About</a></li>
        </ul>

        <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='/login/login'" >Login</button>
            <button type="button" class="btn btn-primary" onclick="location.href='/member/insert'">Sign-up</button>
        </div>
    </header>
</div>