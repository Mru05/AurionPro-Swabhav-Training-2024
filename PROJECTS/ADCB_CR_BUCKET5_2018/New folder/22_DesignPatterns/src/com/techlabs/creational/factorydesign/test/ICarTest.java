package com.techlabs.creational.factorydesign.test;

import com.techlabs.creational.factorydesign.model.CarFactory;
import com.techlabs.creational.factorydesign.model.ICar;
import com.techlabs.creational.factorydesign.model.ICarEnum;
public class ICarTest {
	public static void main(String[] args) {
		//ICarEnum car1 = ICarEnum.Maruti;
      //  System.out.println("Selected car: " + car1);
		ICar car;
		 car = CarFactory.makeCar("Maruti");
		 car.start();
		 car.stop();
		 car = CarFactory.makeCar("Mahindra");
		 car.start();
		 car.stop();
		 car = CarFactory.makeCar("Tata");
		 car.start();
		 car.stop();
		
	}

}
