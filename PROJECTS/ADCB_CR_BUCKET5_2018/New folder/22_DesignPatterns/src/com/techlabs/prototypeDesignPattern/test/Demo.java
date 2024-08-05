package com.techlabs.prototypeDesignPattern.test;

import com.techlabs.prototypeDesignPattern.BookShop;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setName("Novelty");
		bs.loadData();
		
			
		BookShop bs1 = (BookShop)bs.clone();
		bs.getBooks().remove(3);
		bs1.setName("Mrunalini");
		System.out.println(bs);
		System.out.println(bs1);

	}

}
