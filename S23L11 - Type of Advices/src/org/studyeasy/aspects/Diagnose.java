package org.studyeasy.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {
	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void run(){}

	@Before("run()")
	public void beforeAdvice(){
		System.out.println("Before Advice");
	}
	
	/*@After("run()")
	public void afterAdvice(){
		System.out.println("After Advice");
	}
	
	@AfterReturning("run()")
	public void afterAdvice(){
		System.out.println("After Returning Advice");
	}*/
	
	@AfterThrowing("run()")
	public void afterAdvice(){
		System.out.println("After Throwing Advice");
	}
	
	
}







