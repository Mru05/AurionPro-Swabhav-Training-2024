package com.techlabs.Voilation.model;

public class InvoicePrinter {
	private Invoice Invoice;
	 private TaxCalculator taxcalculator;
	
 public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice invoice) {
		Invoice = invoice;
	}

	public TaxCalculator getTaxcalculator() {
		return taxcalculator;
	}

	public void setTaxcalculator(TaxCalculator taxcalculator) {
		this.taxcalculator = taxcalculator;
	}

public void displayInvoice() {
	 
		 
		 System.out.println(Invoice.getId());
		 System.out.println(Invoice.getDescription());
		 System.out.println(Invoice.getAmount());
		 System.out.println(Invoice.getTax());
		 System.out.println(Invoice.getAmount());
		  
	  }

}
