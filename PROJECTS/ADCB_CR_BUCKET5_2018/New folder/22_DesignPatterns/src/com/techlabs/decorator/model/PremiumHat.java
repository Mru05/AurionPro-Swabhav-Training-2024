package com.techlabs.decorator.model;

public class PremiumHat implements Item{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Premium";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "20";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A premium hat with better quality";
	}

}
