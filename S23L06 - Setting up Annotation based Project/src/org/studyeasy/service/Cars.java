package org.studyeasy.service;

import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.PetrolCar;

public class Cars {
	public ElectricCar electricCar = new ElectricCar();
	public PetrolCar petrolCar = new PetrolCar();
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
