package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculater
 */
@WebServlet("/calculater")
public class calculater extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculater() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2= Integer.parseInt(request.getParameter("num2")) ;
		String symble=request.getParameter("calculater");
		String ans="";
		if(symble.equals("Addiction")) {
			ans="Sum of two num is "+ (num1+num2);
		}
		else if (symble.equals("Subtraction")) {
			ans="Subtraction  of two num is "+ (num1-num2);
		}
		else if (symble.equals("Multiplication")) {
			ans="Multiplication  of two num is "+ (num1*num2);
		}
		else if (symble.equals("Division")) {
			ans="Division of two num is "+ (num1/num2);
		}
		else ans="Incurrect Input";

		out.println(ans);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
