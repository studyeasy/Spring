package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class Diagnose {
	
/*	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void targetPointcut(){};
	
	@Before("targetPointcut()")
	public void testAdvice(){
		System.out.println("test Advice");
	}
	*/
	
	@Pointcut("@annotation(Deprecated)")
	public void annotationPointcut(){};
	
	@Before("annotationPointcut()")
	public void testAdvice2(){
		System.out.println("test Advice for annotation");
	}

	
}







