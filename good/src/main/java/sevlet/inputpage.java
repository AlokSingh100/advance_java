package sevlet;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inputpage
 */
@WebServlet("/inputpage")
public class inputpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inputpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	PrintWriter out=response.getWriter();
//	int satus=0;
//	String empid=request.getParameter("id");
//	String name=request.getParameter("name");
//	String sal=request.getParameter("sal") ;
//	int salary=Integer.valueOf(sal);
//	
//	
//	out.println("EmpId:="+ empid);
//	out.println("Name:="+ name);
//	out.println("Salary:="+ salary);
//    String a=empid+ ",'" +name+"',"+salary;
	try 
	{
		  Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver register");
	        Connection cnot=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
	        System.out.println("Sql Connection Establish");
	        Statement stma=(Statement) cnot.createStatement();
		/*Statement st= con.createStatement();
		PreparedStatement ps=con.prepareStatement("Insert into employe values (" +a+");");
		satus=ps.executeUpdate();
		con.close();
		*/
	}catch (Exception e) {
		// TODO: handle exception
		System.out.print(e.getMessage());
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
