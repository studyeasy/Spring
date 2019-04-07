package org.studyeasy.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.studyeasy.cars.PetrolCar;

@Aspect
public class Diagnose {
	
  
	@Before("execution(void run(int))")
	public void testAdvice(JoinPoint jp){
		//System.out.println(jp.toString());
		//PetrolCar car = (PetrolCar) jp.getTarget();
		//car.run("Test call to run method");
		
		for(Object ob : jp.getArgs()){
			System.out.println("Arg received : "+ob);
		}
		
		System.out.println("Test Advice");
	}
	
	
}







