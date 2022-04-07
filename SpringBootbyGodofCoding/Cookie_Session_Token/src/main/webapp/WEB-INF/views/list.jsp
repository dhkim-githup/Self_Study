<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    /* getCookie */
    //out.println("Cookie");



    String strCookieName="", strCookieAge="";
    Cookie [] cookies = request.getCookies();

    if ( cookies != null ){
        for(int i = 0; i < cookies.length; i++){
            if(cookies[i].getName().equals("name"))  // name
                strCookieName = cookies[i].getValue();
             else if(cookies[i].getName().equals("age")) // age
                strCookieAge = cookies[i].getValue();
        }// Enf for

        //out.println("strCookieName:"+strCookieName+" |" + "strCookieAge:"+strCookieAge);

    }// End IF
%>