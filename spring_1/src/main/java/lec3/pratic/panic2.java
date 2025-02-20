package lec3.pratic;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class panic2 {
	
	@After("execution(public void lec3.pratic.pacnac.name())")
public void name22() {
	System.out.println("hallo new");
}
}
