package com.techlabs.model;

public class AreaCalculator {
	
	double calculatorAreaofCircle(int radius) {
		return 3.14*radius*radius;
	}
	int calculatorAreaofRectangle(int length, int breadth) {
		return length*breadth;
	}
	int calculatorAreaofTriangle(int base,int height) {
		return (int) (0.5*(base*height));
	}
	

}
