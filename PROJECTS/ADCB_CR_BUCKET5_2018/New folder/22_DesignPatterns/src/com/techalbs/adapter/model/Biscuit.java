package com.techalbs.adapter.model;

public class Biscuit implements ITem{
	private String name;
    private double price;
   
	

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}
