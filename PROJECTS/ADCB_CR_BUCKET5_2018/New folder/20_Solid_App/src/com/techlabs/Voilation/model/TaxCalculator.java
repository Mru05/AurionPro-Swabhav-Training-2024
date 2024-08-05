package com.techlabs.Voilation.model;

public class TaxCalculator {
	
	private Invoice Invoice;
	 public TaxCalculator(com.techlabs.Voilation.model.Invoice invoice) {
		super();
		Invoice = invoice;
	}
	public double calculateTax(double calculateTax) {
    	 
	    	return Invoice.getAmount()* Invoice.getTax()/100;
	    	 
	    	 
	     }
	public Invoice getInvoice() {
		return Invoice;
	}
	public void setInvoice(Invoice invoice) {
		Invoice = invoice;
	}
}
