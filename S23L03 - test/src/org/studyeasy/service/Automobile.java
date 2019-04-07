package org.studyeasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.studyeasy.automobile.ElectricCar;
import org.studyeasy.automobile.PetrolCar;


public class Automobile {
	@Autowired
	ElectricCar electricCar;
	@Autowired
	PetrolCar PetrolCar;
	public ElectricCar getElectricCar() {
		return electricCar;
	}
	public void setElectricCar(ElectricCar electricCar) {
		this.electricCar = electricCar;
	}
	public PetrolCar getPetrolCar() {
		return PetrolCar;
	}
	public void setPetrolCar(PetrolCar petrolCar) {
		PetrolCar = petrolCar;
	}
	

}
