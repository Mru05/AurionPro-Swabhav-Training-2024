package com.techlabs.decorator.test;

import com.techlabs.decorator.model.GoldenHat;
import com.techlabs.decorator.model.Item;
import com.techlabs.decorator.model.PremiumHat;
import com.techlabs.decorator.model.RibbonHat;
import com.techlabs.decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item standardHat = new StandardHat();
		Item premiunHat = new PremiumHat();
		
		Item goldenHat = new GoldenHat(standardHat);
		Item ribbionHat = new RibbonHat(premiunHat);
		
		System.out.println("Welcome to our Hat Shop!!!!!!");
		System.out.println("");
		System.out.println(goldenHat.getName()+" :\n "+goldenHat.getDescription()+" : "+goldenHat.getPrice());
		System.out.println("");
		System.out.println(ribbionHat.getName()+" :\n "+ribbionHat.getDescription()+" : "+ ribbionHat.getPrice());

	}

}
