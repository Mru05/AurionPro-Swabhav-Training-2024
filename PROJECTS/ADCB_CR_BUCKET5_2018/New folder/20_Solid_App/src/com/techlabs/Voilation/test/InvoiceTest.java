package com.techlabs.Voilation.test;

import com.techlabs.Voilation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice("1", "Mru", 10, 200);
        invoice.calculateTax(20);
        
	}

}
