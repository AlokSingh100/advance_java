package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlServ
 */
@WebServlet("/UrlServ")
public class UrlServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		double sal=Double.parseDouble(request.getParameter("sal"));
		
		
		out.println("Welcome "+name+" your salary details are");
		out.println("<br>Salary details:");
		out.println("Salary:"+sal+"<br>");
		out.println("HRA:"+(sal*10/100)+"<br>");
		out.println("PF:"+(sal*3/100)+"<br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
