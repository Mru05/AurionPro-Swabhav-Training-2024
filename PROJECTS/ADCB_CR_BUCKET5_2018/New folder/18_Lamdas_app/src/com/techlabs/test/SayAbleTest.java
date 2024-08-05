package com.techlabs.test;

import com.techlabs.model.ISayAble;

public class SayAbleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ISayAble sayable= () -> System.out.println("I am inside sayable"); //This is lambda expression
		//only possible for functional interface
		
		
		sayHello(sayable);
	}
		
		
//		ISayAble sayable = new ISayAble() {
//
//			@Override
//			public void say() {
//				// TODO Auto-generated method stub
//				System.out.println("I am inside I am say able");
//				
//			}
//			
//		};		

	

	private static void sayHello(ISayAble sayable) {
		// TODO Auto-generated method stub
		sayable.say();
		
	}

}

