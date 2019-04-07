package org.studyeasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.PetrolCar;

public class Cars {
	@Autowired
	public ElectricCar electricCar;
	@Autowired
	public PetrolCar petrolCar;
	public ElectricCar getElectricCar() {
		return electricCar;
	}
	public void setElectricCar(ElectricCar electricCar) {
		this.electricCar = electricCar;
	}
	public PetrolCar getPetrolCar() {
		return petrolCar;
	}
	public void setPetrolCar(PetrolCar petrolCar) {
		this.petrolCar = petrolCar;
	}

}
