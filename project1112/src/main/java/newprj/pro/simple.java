package newprj.pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class simple {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("newprj/pro/jbbc.xml");
		EmpDAO dao=(EmpDAO)ctx.getBean("edao");
		int status=dao.saveEmployee(new employee(7788,"nitan","kamat",785421));
		System.out.println(status);
	}
}
