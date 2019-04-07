package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {
	@Pointcut("execution(* org.studyeasy.cars.*.*(..))")
	public void run(){}
	
  
	@Before("run()")
	public void testAdvice(){
		System.out.println("Test Advice");
	}
	
	
}







