package org.studyeasy.automobile;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ElectricCar {

	@After("execution(public void run())")
public void run(){
	
	System.out.println("Praful Car Running");
}
}
