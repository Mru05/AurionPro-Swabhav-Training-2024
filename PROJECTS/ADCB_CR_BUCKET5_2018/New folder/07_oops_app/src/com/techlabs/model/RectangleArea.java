package com.techlabs.model;

public class RectangleArea {
	private int width;
	private int height;
	public int result;
	
public void setHeight(int h) {
	
		height = h;
	}
public int getHeight() {
	return height;
}

public void setwidth(int w) {
	
	width =w;
}
public int getwidth() {
	return width;
}

//	public void  display(){
//		
//		System.out.println("HEIGHT = "+height);
//		System.out.println("width = "+width);
//}
	public void calculate() {
	     result = height*width;
	}
	public void DisplayResult() {
		System.out.println("Area = "+result);
	}
}
