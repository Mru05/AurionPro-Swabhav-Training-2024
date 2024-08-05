package com.techlabs.exceptions;

public class AgeNotValidException extends Exception{
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	public String getMessage() {
		return "Age cannot be less than 18";
	}

}
