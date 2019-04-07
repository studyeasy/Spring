package org.studyeasy.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Diagnosis {
	@Before("execution(*)")
	public void diagnose(JoinPoint JP){
		JP.notify();
		System.out.println("Engine check");
	}

}
