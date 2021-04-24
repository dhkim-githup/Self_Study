package com.easy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EasyServlet
 */
@WebServlet("/EasyServlet")
public class EasyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EasyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		String strName = request.getParameter("name");
		
		System.out.println(strName);
		
		
		//String strForward = "/WEB-INF/view/forward.jsp";
		//String strSend    = "/Easy/send.jsp";
		
		String strForward = "/WEB-INF/view/forward.html";
		String strSend    = "/Easy/send.html";
		
		
		request.setAttribute("Age", "40 years");
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(strForward);
		dispatcher.forward(request, response);
		
		
		//response.sendRedirect(strSend);
		
		System.out.println("수고했어..");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
