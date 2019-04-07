package org.studyeasy.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("aspect")
@org.aspectj.lang.annotation.Aspect()
public class Aspect {
	   @Pointcut("@target(org.springframework.stereotype.Controller)")
	    public void controllerBean() {}

	    @Pointcut("execution(* helloWorld(..))")
	    public void methodPointcut() {}

	    @AfterReturning("controllerBean() && methodPointcut() ")
	    public void helloWorld() {
	        System.out.println("after advice..");
	    }
}
