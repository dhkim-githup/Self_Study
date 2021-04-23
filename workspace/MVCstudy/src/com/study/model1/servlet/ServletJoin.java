package com.study.model1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.comm.repository.Repository_member;
import com.study.comm.vo.Members;

/**
 * Servlet implementation class ServletJoin
 */
@WebServlet("/model1/servlet/new_member")
public class ServletJoin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/* Repository_member 객체를 얻어온다 */
	private Repository_member repository_member = new Repository_member();
    
    public ServletJoin() {
        super();    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet Start position");		
		
		/* get Request value, jsp 의 request 받는것과 동일하다. */
		String  userName  = request.getParameter("input_name"); 
		int     userAge   = Integer.parseInt(request.getParameter("input_age")); 
		String userMobile = request.getParameter("input_mobile");
		
		System.out.println("request value = "+ userName +"/" + Integer.toString(userAge) + "/" + userMobile);
		
		/* Members 변수는 생성자를 통해 한방에 넣는다. */
		Members members = new Members(userName, userAge, userMobile);
		
		/* 값을 List 에 저장하여 아래에 뿌려줄때 사용 */
		repository_member.setSave(members); 
		
		/* 아래가 바로 초창기 Servlet 의 위엄... */
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter w = response.getWriter();
		
		w.write("<html>\n" +
		"<head>\n" +
		" <meta charset=\"UTF-8\">\n" +
		"</head>\n" +
		"<body>\n" +
		"NewMember\n" +
		"<ul>\n" +
		" <li>Name   ="+members.getStrName()  +"</li>\n" +
		" <li>Age    ="+members.getIntAge()   +"</li>\n" +
		" <li>Mobile ="+members.getStrMobile()+"</li>\n" +
		"</ul>\n" +
		"<a href=\"/index.html\">Go Home</a>\n" +
		"</body>\n" +
		"</html>");
		
	}

	/**
	 * 모든 처리를 doGet 에서 처리하도록 하기 위해 아래 doPost 에서 받은 request, response 값을 doPost 로 던져준다.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
