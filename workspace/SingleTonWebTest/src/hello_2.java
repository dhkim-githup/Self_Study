

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no_singleton.NaSingleClassNo;
import singleton.NaSingleClass;

/**
 * Servlet implementation class hello_2
 */
@WebServlet("/hello_2")
public class hello_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String strIp   = request.getRemoteAddr();
		
		System.out.println("\n\n\n\n ================ No Single =========================="+strIp);
		// No Single
		NaSingleClassNo na  = new NaSingleClassNo();
		NaSingleClassNo na2 = new NaSingleClassNo();
		NaSingleClassNo na3 = new NaSingleClassNo();
		
		
		
		 System.out.printf("na ,  %s , %s \n", na, na.getStrName());
		 System.out.printf("na2 , %s , %s \n", na2, na2.getStrName());
		 System.out.printf("na3 , %s , %s \n", na3, na3.getStrName());
		 
		
		System.out.println("\n ================ No Single =========================="+strIp);
		
		// Single		
		NaSingleClass naS = NaSingleClass.getSingleInstance();
		NaSingleClass naS2 = NaSingleClass.getSingleInstance();
		NaSingleClass naS3 = NaSingleClass.getSingleInstance();
		
		
		 System.out.printf("naS ,  %s , %s \n", naS, naS.getStrName());
		 System.out.printf("naS2 , %s , %s \n", naS2, naS2.getStrName());;
		 System.out.printf("naS3 , %s , %s \n", naS3, naS3.getStrName());;
		 
		
		/* 아래가 바로 초창기 Servlet 의 위엄... */
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter w = response.getWriter();
		
		w.write("<html>\n" +
		"<head>\n" +
		"<meta charset=\"UTF-8\">\n" +
		"</head>\n" +
		"<body>\n" +
		"<p> =============== No Single =========================="+strIp+
		"<ul>\n" +
		" <li>na Address  = "+na +" , _______Name: "+na.getStrName()  +"</li>\n" +
		" <li>na2 Address  ="+na2+" , _______Name: "+na2.getStrName()   +"</li>\n" +
		" <li>na3 Address  ="+na3+" , _______Name: "+na3.getStrName()+"</li>\n" +
		"</ul>\n" +
		"<p> ===============  Single =========================="+strIp+
		"<ul>\n" +
		" <li>naS Address  = "+naS +" , _______Name: "+naS.getStrName()  +"</li>\n" +
		" <li>naS2 Address  ="+naS2+" , _______Name: "+naS2.getStrName()   +"</li>\n" +
		" <li>naS3 Address  ="+naS3+" , _______Name: "+naS3.getStrName()+"</li>\n" +
		"</ul>\n" +
		"</body>\n" +
		"</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
