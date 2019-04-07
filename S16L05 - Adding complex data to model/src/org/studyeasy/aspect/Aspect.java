package org.studyeasy.aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component 
public class Aspect {
	
	@Before("execution(public ModelAndView helloWorld(String))")
	public void log(){
		System.out.println("logged");
	}

}
