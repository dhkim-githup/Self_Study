package com.study.model1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/model1/servlet/member_list")
public class ServletList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* Repository_member 객체를 얻어온다 , Members 에 있는 값을 가져와야 함. */
	private Repository_member repository_member = new Repository_member();
       
    public ServletList() {
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
		
		
		/* 아래가 바로 초창기 Servlet 의 위엄... */
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter w = response.getWriter();
		
		w.write("<html>");
		w.write("<head>");
		w.write(" <meta charset=\"UTF-8\">");
		w.write(" <title>Title</title>");
		w.write("</head>");
		w.write("<body>");
		
		w.write("<table>");
		w.write(" <tr>");		
		w.write(" <th>Name</th>");
		w.write(" <th>Age</th>");
		w.write(" <th>Mobile</th>");
		w.write(" </tr>");		
		
		/* 예전에는 int i=0; i<list.size(); i++ , 이렇게도 사용했지만, 아랫처럼 사용도 가능, 신박함 
		 * lst 에 있는 값을 객체로 반환함. 
		 * */
		for (Members members : list) {
			w.write(" <tr>");
			w.write(" <td>" + members.getStrName() + "</td>");
			w.write(" <td>" + members.getIntAge()+ "</td>");
			w.write(" <td>" + members.getStrMobile() + "</td>");
			w.write(" </tr>");
			}
			
		w.write("</table>");
		w.write("</body>");
	    w.write("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
