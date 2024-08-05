package com.techlabs.decorator.model;

public class WheelAlign extends CarDecoratorService {

	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	public double getcost() {
		return 500+super.getCost();
		
	}

}
