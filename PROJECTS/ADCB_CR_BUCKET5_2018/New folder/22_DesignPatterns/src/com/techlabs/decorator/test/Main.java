package com.techlabs.decorator.test;
import com.techlabs.decorator.model.CarInspection;
import com.techlabs.decorator.model.ICarService;
import com.techlabs.decorator.model.OilChange;
import com.techlabs.decorator.model.WheelAlign;

public class Main {
	
	    public static void main(String[] args) {
	        ICarService service = new CarInspection();
	        System.out.println("Cost of Car Inspection: " + service.getCost());

	        service = new OilChange(service);
	        System.out.println("Cost after Oil Change: " + service.getCost());

	        service = new WheelAlign(service);
	        System.out.println("Cost after Wheel Alignment: " + service.getCost());
	    }
	}


