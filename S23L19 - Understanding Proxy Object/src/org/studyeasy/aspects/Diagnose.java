package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect()
public class Diagnose {
	
	@Before("execution(public void run())")
	public void testAdvice(){
		System.out.println("Test advice");
	}
	
	
}







