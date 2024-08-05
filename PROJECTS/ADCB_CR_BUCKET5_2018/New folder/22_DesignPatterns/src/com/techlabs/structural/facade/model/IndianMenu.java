package com.techlabs.structural.facade.model;

public class IndianMenu implements IMenu{

	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		System.out.println("This is Indian Menu");
		
		
	}
	public String display() {
		System.out.println("1.Fried Rice");
		return display();
	}

}
