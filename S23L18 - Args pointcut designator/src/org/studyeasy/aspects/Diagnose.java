package org.studyeasy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnose {
	
    
	
	@Before("args(temp,temp2)")
	public void testAdvice(int temp, int temp2){
		System.out.println("Value received: "+temp+" "+ + temp2);
	}
	
	
}







