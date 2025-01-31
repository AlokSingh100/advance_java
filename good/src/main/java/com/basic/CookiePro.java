package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiePro
 */
@WebServlet("/CookiePro")
public class CookiePro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiePro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String pname=request.getParameter("pname");
		String qty=request.getParameter("qty");
		String add=request.getParameter("add");
		String list=request.getParameter("list");
		
		PrintWriter out=response.getWriter();
		
		System.out.println(add);
		if(add!=null)
		{
			Cookie cookie=new Cookie(pname,qty);
			response.addCookie(cookie);
			response.sendRedirect("good/CookiePro.html");
		}
		else if(list!=null)
		{
			Cookie cookie[]=request.getCookies();
			for(Cookie c:cookie)
			{
				out.println("<font color='blue'>"+c.getName()+"\t:\t"+c.getValue()+"<br><br>");
			}
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
