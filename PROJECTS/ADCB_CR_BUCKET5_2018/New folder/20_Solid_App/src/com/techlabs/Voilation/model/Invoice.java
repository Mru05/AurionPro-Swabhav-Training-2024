package com.techlabs.Voilation.model;

public class Invoice {
     private String id;
     private String description;
     private double tax;
     private int amount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", tax=" + tax + "]";
	}
     public double calculateTax(double calculateTax) {
    	 
    	return amount * tax/100;
    	 
    	 
     }
    
	public int getAmount() {
		return amount;
	}
	public Invoice(String id, String description, double tax, int amount) {
		super();
		this.id = id;
		this.description = description;
		this.tax = tax;
		this.amount = amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
 