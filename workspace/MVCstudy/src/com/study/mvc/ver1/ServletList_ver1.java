package com.study.mvc.ver1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.comm.repository.Repository_member;
import com.study.comm.vo.Members;

/**
 * Servlet implementation class ServletList
 */
@WebServlet("/mvc/ver1/member_list")
public class ServletList_ver1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* Repository_member 객체를 얻어온다 , Members 에 있는 값을 가져와야 함. */
	private Repository_member repository_member = new Repository_member();
       
    public ServletList_ver1() {
        super();    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 *  Member 의 값을 받을 List 생성,, 여러개를 받기 위해 List 객체를 사용
		 *  아래 같은 구문이 솔직히 나에겐 어려움.. 
		 *  이해하자면, Members 객체를 인자로 하는 List 객체는  repository_member 가 갖고 있는 List 를 생성한다.
		 *  */
		List<Members> list = repository_member.getList();
		
		System.out.println("list.size => "+ list.size());
		
		// 위 list 를 jsp 에서 받을 수 있게 list 객체를 던진다.
		request.setAttribute("list", list);
		/*   
		 * 단순하게 해당 jsp만 호출 
		 * */
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/mvc/servletJoin_ver1_list.jsp");
		 dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
