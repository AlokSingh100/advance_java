package sunita.neha;

import org.springframework.context. ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class smart {

	



	public static void main(String[] args) {

	ApplicationContext context= new ClassPathXmlApplicationContext("sunita/neha/NewFile.xml");

	Student ob=(Student) context.getBean("stud");

	System.out.println(ob);
	
}
	
}
