package com.imsi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Test Servlet");
		
		String strName = request.getParameter("name");
		
		request.setAttribute("name2", "Lee");
		
		System.out.println("strName ="+strName);
		
		String strPath = "/WEB-INF/views/test.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(strPath);     
		dispatcher.forward(request, response);
		
		//dispatcher.include(request, response);
		
		System.out.println("Here Forward, Servlet");

		response.sendRedirect(strPath);
		//response.sendRedirect("/jsp/test.jsp");
		
		// 데이타 출력 해주세요.  - controller - > service
		
		// 데이타 연결 - dao
		
		// select - myba
		
		// 값 저장 - repository , vo(members)
		
		// 값 전달 .   setA
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
