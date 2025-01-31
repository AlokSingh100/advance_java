package seccen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class scsessin
 */
@WebServlet("/scsessin")
public class scsessin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public scsessin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();

String user=request.getParameter("username");
String pass=request.getParameter("pass");

request.getRequestDispatcher("/Main.html").include(request,response);

if (pass.equals("happy")) {
	
	out.println("Welcome "+ user);
	HttpSession ses=request.getSession();
	ses.setAttribute("User", user);
}
else {
	out.println("Password is Wrong ");
	request.getRequestDispatcher("/login.html").include(request, response);
	
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
