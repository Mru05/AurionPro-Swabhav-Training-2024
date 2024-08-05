package com.techlabs.model;

public class Triangle implements Shape{
	
	private int length;
	private int breadth;

	

	public Triangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Aear of triangle = "+(0.5 *length*breadth));
		
	}

}
