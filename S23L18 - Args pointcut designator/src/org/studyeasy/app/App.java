package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.config.Config;
import org.studyeasy.service.Cars;

public class App {

	public static void main(String args[]){
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		Cars car = context.getBean("cars", Cars.class);
		
			car.getPetrolCar().run(100,50);
		context.close();
	}

}
