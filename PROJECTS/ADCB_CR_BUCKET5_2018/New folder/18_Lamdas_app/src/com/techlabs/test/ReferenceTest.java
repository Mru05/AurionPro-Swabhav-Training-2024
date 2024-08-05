package com.techlabs.test;

import com.techlabs.model.ITest;
import com.techlabs.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		ITest test = Reference :: new ; //for constructor
		method(test);
		
		ITest test1 = Reference :: staticPrint; //for static method 
		method(test1);
		
		Reference reference = new Reference(); //for non Static methods
		ITest test2 = reference::print; 
		method(test1);
		

	}
	private static void method(ITest test) {
		
		test.display();
	}
	

}
