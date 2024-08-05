package com.techlabs.creational.factorydesign.model;

import com.techlabs.creational.factorydesign.abstractfactory.ICarFactory;

public class MarutiFactory implements ICarFactory{

	 
    @Override
	public ICar createcar() {
		// TODO Auto-generated method stub
		return new Maruti();
	}
	

}
