package com.techalbs.adapter.model;

public class HatAdapter implements ITem{
	private Hat hat;

    public HatAdapter(Hat hat) {
        this.hat = hat;
    }

    @Override
    public String getItemName() {
        return hat.getShortName();
    }

    @Override
    public double getItemPrice() {
        return hat.getTotalPrice();
    }
	

}
