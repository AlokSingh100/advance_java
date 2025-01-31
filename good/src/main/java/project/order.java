package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class order
 */
@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public order() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("Name");
		String Deep=request.getParameter("Deep Crust");
		String Tops[]=request.getParameterValues("Topping");
		String appi=request.getParameter("Appetizer");
		String Add=request.getParameter("Address");
		String Payment=request.getParameter("Payment");
		

		
		out.println( 
		"<table border=\"2\" style=\"margin: auto; text-align: center;\">\r\n"
		+ "        <h1>"+Name+" Order</h1>\r\n"
		+ "        <thead>\r\n"
		+ "            <tr>\r\n"
		+ "                <th>Parameter Name</th>\r\n"
		+ "                <th>Parameter Value</th>\r\n"
		+ "                \r\n"
		+ "            </tr>\r\n"
		+ "        </thead>\r\n"
		+ "        <tbody>\r\n"
		+ "            <tr>\r\n"
		+ "                <td>Name</td>\r\n"
		+ "                <td>"+Name+"</td>\r\n"
		+ "              \r\n"
		+ "            </tr>\r\n"
		+ "            <tr>\r\n"
		+ "                <td>Crust</td>\r\n"
		+ "                <td>"+Deep+"</td>\r\n"
		+ "                \r\n"
		+ "            </tr>\r\n"
		+ "            <tr>\r\n"
		+ "                <td>Toppings</td>\r\n"
		+ "                <td>");
		for(String to:Tops ) 
		{out.println(to+"<br>");}
		out.println("</td>\r\n"
		+ "                \r\n"
		+ "            </tr>\r\n"
		+ "            <tr>\r\n"
		+ "                <td>Appetizer</td>\r\n"
		+ "                <td>"+appi+"</td>\r\n"
		+ "                \r\n"
		+ "            </tr>    \r\n"
		+ "            <tr>\r\n"
		+ "                <td>Addres</td>\r\n"
		+ "                <td>"+Add+"</td>\r\n"
		+ "                \r\n"
		+ "            </tr>   \r\n"
		+ "             <tr>\r\n"
		+ "                <td>Cars Type</td>\r\n"
		+ "                <td>"+Payment+"</td>\r\n"
		+ "                \r\n"
		+ "            </tr>\r\n"
		+ "            <tr>\r\n"
		+ "                <td>Order Type</td>\r\n"
		+ "                <td>Order Placed</td>\r\n"
		+ "                \r\n"
		+ "            </tr>\r\n"
		+ "        </tbody>\r\n"
		+ "    </table>"	
				
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
