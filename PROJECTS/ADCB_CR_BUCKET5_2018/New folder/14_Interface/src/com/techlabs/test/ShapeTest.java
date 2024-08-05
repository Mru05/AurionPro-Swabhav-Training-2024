package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;
import com.techlabs.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s= new Circle(10);
		s.area();
		s= new Rectangle(10,20);
		s.area();
		s= new Triangle(10,29);
        s.area();
	}

}
