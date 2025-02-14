package main.imp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
public static void main(String[] arg) {
	


    ApplicationContext con=new ClassPathXmlApplicationContext("main/imp/config.xml");
    person ob=(person) con.getBean("per");
    System.out.println(ob);
}
   
}
