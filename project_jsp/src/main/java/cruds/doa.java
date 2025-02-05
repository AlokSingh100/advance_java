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
	          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root","Aptech@123");
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
//
//	      /**
//	       * @param empno
//	       * @return
//	       */
//	    
//	      public emp_pojo getEmp(int empno) {
//	          return null;
//	      }
//
//	      /**
//	       * @param e
//	       */
//
//	      public void updateEmp(matrix e) {
//
//	          Connection con ;
//	          try {
//	  con=connection();
////	  String updates= "update employe set Name= '"+e.empname+"' where EmpID= "+e.empid;
//
//	       //       PreparedStatement update = con.prepareStatement(updates);
//	  //update.setString(1,e.empname);
//	  //update.setInt(2,e.empid);
//	           //   update.executeUpdate();
//	        //      System.out.println(updates);
//	          }catch (Exception ex){
//	              System.out.println(ex.getMessage());
//	          }
//	      }
//
//	      /**
//	       * @param e
//	       */
////	      public void deleteEmp(emp_pojo e) {
////	          Connection con;
////	          try {
////	              con=connection();
////	           String del=" delete from employe where EmpID="+ e.empid;
////	  PreparedStatement deleate=con.prepareStatement(del);
////	  deleate.executeUpdate();
////
////	          }catch (Exception ex ) {
////	              System.out.println(ex);
////	          }
////	      }
//	      public mainpojo getId1(int ida)  {
//	  		int status=0;
//	  		 Connection con ;
//	         try {
//	 con=connection();
//	  		PreparedStatement ps=con.prepareStatement("select * from emp where id=?");
//	  		ps.setInt(1, ida);
//	  		System.out.println(ps);
//	  		ResultSet rs=ps.executeQuery();
//	  	
//	  		while(rs.next()) {
//	  			ma.setId(rs.getString("id"));
//	  			ma.setName(rs.getString("name"));
//	  			ma.setPassword(rs.getString("password"));
//	  			ma.setMail(rs.getString("mail"));
//	  			ma.setCountry(rs.getString("country"));
//
//	  		}
//	  		
//	         }catch (Exception ex){
//	             System.out.println(ex.getMessage());
//	         }
//			return ma;
//	  	}
//

}
