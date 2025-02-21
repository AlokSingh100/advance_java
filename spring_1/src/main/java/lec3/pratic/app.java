package lec3.pratic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext con=new ClassPathXmlApplicationContext("lec3/pratic/newFile.xml");
		pacnac ob=(pacnac) con.getBean("pacnic");
		ob.name();
		ob.getId();
		System.out.println(ob.hello("testing"));
		
		try {
			ob.printThrowException();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
