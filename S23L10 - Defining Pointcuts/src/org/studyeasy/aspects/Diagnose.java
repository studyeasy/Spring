package org.studyeasy.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Before("run()")
	public void engine1(){
		System.out.println("Checking engine before");
	}
	
	@After("run()")
	public void engine2(){
		System.out.println("Checking engine after");
	}

	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void run(){}
	
}
