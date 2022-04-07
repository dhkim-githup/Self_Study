<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    String strCookieName="", strCookieAge="", strCookieHi="";
    String strSessionName="", strSessionAge="", strSessionHi="";


    /* 쿠키 정보  가져오기 */
    Cookie [] cookies = request.getCookies();
   if ( cookies != null ){
        for(int i = 0; i < cookies.length; i++){
            if(cookies[i].getName().equals("c_name")) { strCookieName = cookies[i].getValue(); }
            if(cookies[i].getName().equals("c_age")) { strCookieAge  = cookies[i].getValue(); }
        }// Enf for

       if("쿠키이름".equals(strCookieName)){ strCookieHi="Welcome Cookie !!";
       }else{ strCookieHi = "No Cookie"; }

    }// End IF

    /* 세션 정보 가져오기 */
    session	= request.getSession(false);	// 이전Session을 계속 사용.

    strSessionName = (String) session.getAttribute("s_name");
        if(strSessionName ==null){strSessionName="";}
    strSessionAge  = (String) session.getAttribute("s_age");
        if(strSessionAge ==null){strSessionAge="";}

    if("세션이름".equals(strSessionName)){ strSessionHi="Welcome Session !!";
    }else{ strSessionHi = "No Session"; }

%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
* 쿠키 & 세션 1 </p>

* 쿠키 :  <%=strCookieHi%>
<form name="Cookie" action="/Cookie" method="post">
    이름 <input type="text" name="c_name" value="<%=strCookieName%>">
    나이 <input type="text" name="c_age"  value="<%=strCookieAge%>">
    <input type="submit">


</form>

</p></p>
* 세션 : <%=strSessionHi%>
  <br>세션ID : <%=session.getId()%>
<form name="Session" action="/Session" method="post">
    이름 <input type="text" name="s_name" value="<%=strSessionName%>">
    나이 <input type="text" name="s_age" value="<%=strSessionAge%>">
    <input type="submit">

    <p><a href="/SessionLogout">* 세션 logout</a>
</form>

</body>
</html>