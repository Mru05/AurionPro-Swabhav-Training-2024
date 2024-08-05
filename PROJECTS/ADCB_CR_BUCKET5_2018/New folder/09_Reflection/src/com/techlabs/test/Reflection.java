package com.techlabs.test;

import java.io.ObjectInput;
import java.lang.reflect.*;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(ObjectInput.class.getConstructors());
		
         
		
		System.out.println("Method :");
		
		Method stringMethods[] = stringClass.getMethods();
		for(Method method : stringMethods) {
			System.out.println(method.getName()+"\t"+method.getParameterCount());
			
		}
		System.out.println();
		
	
	}

}
