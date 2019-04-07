package org.studyeasy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.aspects.Diagnosis;
import org.studyeasy.automobile.ElectricCar;
import org.studyeasy.automobile.PetrolCar;
import org.studyeasy.service.Automobile;

@Configuration
public class AppConfig {
	@Bean(name="electricCar")
	public ElectricCar electricCar(){
		return new ElectricCar();
	}
	@Bean(name="petrolCar")
	public PetrolCar petrolCar(){
		return new PetrolCar();
	}
	@Bean(name="Automobile")
	public Automobile automobileApp(){
		return new Automobile();
	}

}
