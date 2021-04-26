package com.study.mvc.ver1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/mvc/ver1/new_member")
public class ServletJoin_ver1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/* Repository_member 객체를 얻어온다 */
	private Repository_member repository_member = new Repository_member();
    
    public ServletJoin_ver1() {
        super();    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ServletJoin_ver1 Start position");		
		
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
		
		/* 여기 아래 부분을 View 역할을 하는 jsp 로 던진다. 
		 * 던지는 방식은 2가지. 
		 * 1. forward (MVC 가 사용하는건 forward 이다. ) 
		 * 2. sendredirect
		 * */
		
		/* forward 방식 
		 * 고인물이라  왜 jsp를  WEB-INF 에 넣는지 몰랐는데.. 여기에 넣으면 외부에서 접근이 안되어, 소스보안이 됩니다. 
		 * 한번 해보세요. 외부에서 url 로 http://localhost:8080/WEB-INF/views/mvc/servletJoin_ver1_result.jsp 로 하면 안보임.. 
		 * */
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/mvc/servletJoin_ver1_result.jsp");
		 dispatcher.forward(request, response);
		
		/* sendRedirect 방식 
		 * sendRedirect 는 jsp 로 개발을 할때 자주 사용하던 방식이었다. 
		 * 하지만, MVC 에서는 사용하지 않는다고 보면 된다. 
		 * 이유는 간단하다. /WEB-INF 가 외부에서 보이지 않기 때문이고 (단, /WEB-INF 가 아닌 다른 폴더의 jsp 를 호출한다면 보여줄 수는 있다.) 
		 * 또한가지는 어떤 jsp 를 호출했는지 브라우저창에 보여주고 싶지 않기 때문이다.
		 * */
		 //response.sendRedirect("/WEB-INF/views/mvc/servletJoin_ver1_result.jsp");
		
	}

	/**
	 * 모든 처리를 doGet 에서 처리하도록 하기 위해 아래 doPost 에서 받은 request, response 값을 doPost 로 던져준다.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}