package com.techlabs.model;

public class Circle implements Shape {
private int radius;
	public Circle(int radius) {
	super();
	this.radius = radius;
}
	public void area() {
		System.out.println("Area of circle "+(3.14*radius*radius));
		// TODO Auto-generated method stub
		
	}

}
