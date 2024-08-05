package com.techlabs.structural.facade.model;

public class Projector implements Status {

	@Override
	public void getstatus() {
		// TODO Auto-generated method stub
		
	}
	

	
	    public void on() {
	        System.out.println("Projector is on.");
	    }

	    public void off() {
	        System.out.println("Projector is off.");
	    }

	    @Override
	    public String toString() {
	        return "Projector";
	    }
} 

