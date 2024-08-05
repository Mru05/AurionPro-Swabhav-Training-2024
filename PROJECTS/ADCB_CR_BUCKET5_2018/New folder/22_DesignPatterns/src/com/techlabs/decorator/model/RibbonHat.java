package com.techlabs.decorator.model;

public class RibbonHat extends HatDecorator{

	public RibbonHat(Item hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " Available with a cute ribbion";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "Rs" + (Integer.parseInt(hat.getPrice().replace("Rs", "")) + 100);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+" Also now with a pink ribbion";
	}
	

}
