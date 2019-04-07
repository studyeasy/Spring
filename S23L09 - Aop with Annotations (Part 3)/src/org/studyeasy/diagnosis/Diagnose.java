package org.studyeasy.diagnosis;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Diagnose {

	@Before("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void engine1(){
		System.out.println("Checking engine before");
	}
	
	
	@After("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void engine2(){
		System.out.println("Checking engine after");
	}

	

	
}
