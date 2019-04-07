package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.config.AppConfig;
import org.studyeasy.service.Automobile;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Automobile am =  context.getBean("Automobile", Automobile.class);
		am.getPetrolCar().run();
		context.close();
	}

}
