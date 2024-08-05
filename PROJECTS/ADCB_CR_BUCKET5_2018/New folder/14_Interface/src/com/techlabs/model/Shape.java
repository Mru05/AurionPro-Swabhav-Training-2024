package com.techlabs.model;

public interface Shape {
	void area();
	default void volume() {
		System.out.println("this is voulme in shape");
		
	}

}
