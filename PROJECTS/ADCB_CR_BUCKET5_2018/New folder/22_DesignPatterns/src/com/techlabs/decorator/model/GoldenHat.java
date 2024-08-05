package com.techlabs.decorator.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(Item hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getName() {
        return hat.getName() + " with Golden Accessories";
    }

    @Override
    public String getPrice() {
        return "Rs" + (Integer.parseInt(hat.getPrice().replace("Rs", "")) + 150);
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + ", also with some golden SPARKLES!!!";
    }	

}
