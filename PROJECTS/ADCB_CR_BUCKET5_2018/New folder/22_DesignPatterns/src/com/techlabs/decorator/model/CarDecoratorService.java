package com.techlabs.decorator.model;

public class CarDecoratorService implements ICarService {
	protected ICarService carObj;

    public CarDecoratorService(ICarService carObj) {
        this.carObj = carObj;
    }

	@Override
	public double getCost() {	
		return carObj.getCost();
	}

}
