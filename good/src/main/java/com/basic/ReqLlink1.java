package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqLlink1
 */
@WebServlet("/ReqLlink1")
public class ReqLlink1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqLlink1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("Fname");
		
		out.println("<b>Hello"+fname);
		out.println("<br>Please click below button to know your ID");
		out.println("<br><a href='http://localhost:8080/good/reqServ2'>click here</a>");
		
		if(fname.equals("Shreyas"))
		{
			RequestDispatcher req=request.getRequestDispatcher("reqServ2");
			req.forward(request, response);
		}	
		else
		{
			RequestDispatcher req=request.getRequestDispatcher("request1.html");
			req.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
