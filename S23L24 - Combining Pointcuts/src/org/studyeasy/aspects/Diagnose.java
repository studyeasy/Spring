package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class Diagnose {
	
	@Pointcut("@annotation(Deprecated)")
	public void annotationPointcut(){};
	
	@Pointcut("within(org.studyeasy.cars.*)")
	public void withinPointcut(){};
	
	@Pointcut("target(org.studyeasy.cars.ElectricCar)")
	public void targetPointcut(){};
	
	@Before("withinPointcut() && !annotationPointcut()")
	public void testAdvice(){
		System.out.println("Test Advice");
	}
}







