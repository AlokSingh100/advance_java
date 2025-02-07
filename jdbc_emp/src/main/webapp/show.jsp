<%@page import="cruds.doaPojo"%>
<%@page import="cruds.doa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
doaPojo pa=new doaPojo();
doa da=new doa();
List<doaPojo> ns= new  ArrayList<>();
try {
	
	

	ns=da.getAllemp();
    out.println("<table>");
    out.println("    <tr>\r\n"
    		+ "<th>ID</th>\r\n"
    		+ "<th>Name</th>\r\n"
    		
    		+ "<th>Email</th>\r\n"
    		+ "<th>Salary</th>\r\n"
    		+ "<th>Edit</th>\r\n"
    		+ "<th>Delete</th>\r\n"
    		+ "  </tr>  ");
   
    for(doaPojo rs:ns) 
    {

    	
    	out.println("<tr>\r\n"
    			+ "        <td>"+rs.getId()+"</td>\r\n"
    			+ "        <td>"+rs.getName()+"</td>\r\n"
    		
    			+ "        <td>"+rs.getMail()+"</td>\r\n"
    			+ "        <td>"+rs.getSal()+"</td>\r\n"
    			+ "        <td><a href='edit.jsp?id="+rs.getId()+"'>"+"Edit"+"</a></td>\r\n"
    			+ "        <td><a href='delete.jsp?id="+rs.getId()+"'>Deleate</a></td>\r\n"
    			+ "    </tr>");
    
    }
}
    
   catch (Exception e) {
	
}
    





%>




</body>
</html>