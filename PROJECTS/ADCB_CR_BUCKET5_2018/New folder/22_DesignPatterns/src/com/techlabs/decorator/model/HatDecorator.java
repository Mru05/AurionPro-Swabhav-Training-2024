package com.techlabs.decorator.model;

public abstract class HatDecorator implements Item {
	
	protected Item hat;
	
	public HatDecorator(Item hat) {
		super();
		this.hat = hat;
	}

	public Item getHat() {
		return hat;
	}

	public void setHat(Item hat) {
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription();
	}

}
