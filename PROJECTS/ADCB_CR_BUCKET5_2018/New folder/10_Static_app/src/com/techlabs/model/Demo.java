package com.techlabs.model;

public class  Demo {
	private int a=1 ;
	static private int b=1; 
			private int c=1;
	public void increment(){
		a++;
		b++;
		c++;
	}
	public void diplay() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c :"+c);
	}
	static {
		System.out.println("Magic2");
	}

}
