package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.RectangleArea;

public class RectangleAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea ra = new RectangleArea();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter height :");
		int h = scn.nextInt();
		ra.setHeight(h);
		System.out.println("Enter width :");
		int w = scn.nextInt();
		ra.setwidth(w);
		 
		System.out.println("Height = "+ra.getHeight());
		System.out.println("Width = "+ra.getwidth());
		
//		ra.initialize(h, w);
		ra.calculate();
		ra.DisplayResult();
		

	}

}
