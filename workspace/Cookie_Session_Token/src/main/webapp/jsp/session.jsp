<%@ page session="true" language="java" contentType="text/html; charset=EUC-KR"%>

<%
    //session	= request.getSession(false);	// ����Session�� ��� ���.
    String strSessionId = session.getId();

    session.setAttribute("name","Hong");

    out.println("session ID : " + strSessionId);
    out.println("session Name : " + session.getAttribute("name"));

    session.invalidate(); // session (������ �����ϳ� ���Ұ�)

    //session.setAttribute("name","Hong");
    out.println("session ID : " + strSessionId); // ���Ұ� , �ش� ������ ���̻� ����� �Ұ���
    //out.println("session Name : " + session.getAttribute("name"));

%>