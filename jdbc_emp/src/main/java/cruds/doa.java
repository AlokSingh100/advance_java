package cruds;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class doa {

	   List <doaPojo> c;
	   doaPojo am= new doaPojo();

	   Connection connection() throws SQLException, ClassNotFoundException {

	        Class.forName("com.mysql.cj.jdbc.Driver");
	          System.out.println("Driver register");
	          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","root");
	          System.out.println("Sql Connection Establish");

	       return con;
	  }

	      public  int save(doaPojo ma) {

	       Connection con;
	       try {
	           con=connection();

	           String a=  "'"+ma.getName()+"','"+ma.getMail()+"',"+ma.getSal()+"";
	          
	   
	           PreparedStatement insert= con.prepareStatement("Insert into empjsp(name,mail,sal) values (" +a+");");

	  insert.executeUpdate();
	       }catch (Exception e){
	           System.out.println(e);
	       }



	          return 0;
	      }

	      /**
	       * @return
	       */
	      public List<doaPojo> getAllemp() throws SQLException, ClassNotFoundException {
	          Connection con;
//	          Scanner scanner=new Sacanner(System.in);
	          List<doaPojo>  empobject=new ArrayList<doaPojo> ();
	          try {
	              con= connection();
	              Statement Stat=con.createStatement();
	              ResultSet resultSet=Stat.executeQuery("Select * from empjsp");
	              while (resultSet.next()){
	            	  doaPojo ob=new doaPojo();
	                  ob.setId(resultSet.getInt("id"));
	                  ob.setName(resultSet.getString("name"));
	                 
	                  ob.setMail(resultSet.getString("mail"));
	               ob.setSal(resultSet.getInt("sal"));
	                  empobject.add(ob);
       }


	          } catch (Exception e){
	              System.out.println(e.getMessage());

	          }

	          return empobject;
	      }


	      public void updateEmp(doaPojo e) {

	          Connection con ;
	          try {
	  con=connection();
	  String updates= "update empjsp set name= '"+e.name+"',mail='"+e.mail+"',sal="+e.sal+" where id= "+e.id;
System.out.println(updates);
	              PreparedStatement update = con.prepareStatement(updates);
	  
	              update.executeUpdate();
	              System.out.println(updates);
	          }catch (Exception ex){
	              System.out.println(ex.getMessage());
	          }
	      }

	  
	      public void deleteEmp(int a) {
	          Connection con;
	          try {
	              con=connection();
	           String del=" delete from empjsp where id="+ a;
	           System.out.println(a);
	  PreparedStatement deleate=con.prepareStatement(del);
	  deleate.executeUpdate();

	          }catch (Exception ex ) {
	              System.out.println(ex);
	          }
	      }
	      
	      
	      public doaPojo getId1(int ida)  {
	  		int status=0;
	  		doaPojo da=new doaPojo();
	  		 Connection con;
	         try {
	        	
	 con=connection();
	  		PreparedStatement ps=con.prepareStatement("select * from empjsp where id="+ida+";");
	  		ResultSet rs=ps.executeQuery();
	  
	  		while(rs.next()) {
	  			da.setId(rs.getInt("id"));
	  			da.setName(rs.getString("name"));
	  			da.setMail(rs.getString("mail"));
	  			da.setSal(rs.getInt("sal"));

	  		}
	  	
	         }catch (Exception ex){
	             System.out.println(ex.getMessage());
	         }
			return da;
	  	}
//

}
