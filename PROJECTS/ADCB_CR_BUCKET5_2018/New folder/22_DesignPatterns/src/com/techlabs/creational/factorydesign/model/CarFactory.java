package com.techlabs.creational.factorydesign.model;

public class CarFactory {
	
	public static ICar makeCar(String carName) {
	
		ICar car = null;
		if(carName == "Maruti")
			car= new Maruti();
		if(carName == "Mahindra")
			car= new Mahindra();
		if(carName == "Tata")
			car= new Tata();
		
		return car;
		
		
	}

}
