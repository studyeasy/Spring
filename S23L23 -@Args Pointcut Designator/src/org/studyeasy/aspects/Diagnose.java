package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class Diagnose {
	
	
	@Pointcut("@args(Deprecated)")
	public void argsPointcut(){};
	
	@Before("argsPointcut()")
	public void testAdvice(){
		System.out.println("test Advice for @args");
	}

	
}







