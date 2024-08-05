package com.techlabs.test;

import com.techlabs.model.Vehicle;

public class VehiclesType extends Vehicle {
	private int milage;
	public VehiclesType(String companyName,int milage)
	{
		super(companyName);
        this.milage=milage;		
	}
	
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	

}
