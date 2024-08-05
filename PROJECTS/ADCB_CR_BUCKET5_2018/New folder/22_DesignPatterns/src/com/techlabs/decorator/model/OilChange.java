package com.techlabs.decorator.model;

public class OilChange extends CarDecoratorService{

	public OilChange(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	public double getcost() {
		return 500+super.getCost();
		
	}

}
