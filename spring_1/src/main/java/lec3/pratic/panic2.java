package lec3.pratic;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class panic2 {
	
	@Pointcut("execution(*lec.pratic.*.*(..))")
	private void selectAll() {}
	
	@Before("selectAll()")
public void name22() {
	System.out.println("hallo new");
}
	@Around("execution(*lec3.pratic.pacnac.hallo(..))")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime =System.currentTimeMillis();
		Object retult = joinPoint.proceed();
		long endTime =System.currentTimeMillis();
		System.out.println("Method"+ Joinpoint.getSignature()+"executed in"+(endTime - startTime)+"ns");
		return retult;
	}
}
