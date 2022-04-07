<%@ page session="true" language="java" contentType="text/html; charset=EUC-KR"%>

<%
    //session	= request.getSession(false);	// 이전Session을 계속 사용.
    String strSessionId = session.getId();

    session.setAttribute("name","Hong");

    out.println("session ID : " + strSessionId);
    out.println("session Name : " + session.getAttribute("name"));

    session.invalidate(); // session (세션은 존재하나 사용불가)

    //session.setAttribute("name","Hong");
    out.println("session ID : " + strSessionId); // 사용불가 , 해당 세션은 더이상 사용이 불가함
    //out.println("session Name : " + session.getAttribute("name"));

%>