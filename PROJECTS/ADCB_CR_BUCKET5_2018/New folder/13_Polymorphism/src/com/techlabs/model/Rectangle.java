package com.techlabs.model;

public class Rectangle extends Shape{
 private int length;
 private int breadth;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle = "+(length*breadth));
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
