package com.techalbs.adapter.model;

public class Hat {
	
	private String shortName;
	private String longName;
	private double price;
	private int tax;
	  double TotalPrice;
    public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	
	public Hat(String shortName, String longName, double price, int tax) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.price = price;
		this.tax = tax;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
	
	return TotalPrice = tax+price;
	  
	}

}
