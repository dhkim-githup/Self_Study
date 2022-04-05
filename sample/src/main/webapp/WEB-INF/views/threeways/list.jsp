<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    /* getCookie */
    out.println("Cookie <p>");



    String strCookieName="", strCookieAge="";
    Cookie [] cookies = request.getCookies();

    if ( cookies != null ){
        for(int i = 0; i < cookies.length; i++){
            if(cookies[i].getName().equals("name"))  // name
                strCookieName = cookies[i].getValue();
            else if(cookies[i].getName().equals("age")) // age
                strCookieAge = cookies[i].getValue();
        }// Enf for

        out.println("strCookieName : "+strCookieName+" | " + "strCookieAge : "+strCookieAge);

    }// End IF

    /* getSession */
    out.println("<p><p>세션정보 보기 <p>");


    session	= request.getSession(false);	// 이전Session을 계속 사용.
    String strSessionId = session.getId();
    out.println("session ID : " + strSessionId);

    if(session != null) {
        String strSessionName = (String) session.getAttribute("name");
        String strSessionAge = (String) session.getAttribute("age");
        out.println("<br>strSessionName : " + strSessionName + " | " + "strSessionAge : " + strSessionAge);
    }else{
        out.println("세션정보가 없습니다.");
    }
%>