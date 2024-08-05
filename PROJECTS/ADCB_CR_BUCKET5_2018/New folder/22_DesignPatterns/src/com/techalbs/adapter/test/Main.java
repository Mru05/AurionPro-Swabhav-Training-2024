package com.techalbs.adapter.test;

import com.techalbs.adapter.model.Biscuit;
import com.techalbs.adapter.model.Chocolate;
import com.techalbs.adapter.model.Hat;
import com.techalbs.adapter.model.HatAdapter;
import com.techalbs.adapter.model.ITem;
import com.techalbs.adapter.model.ShoppingCart;

public class Main {
	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();
	        Chocolate chocolate = new Chocolate("Snickers", 40);
	        Chocolate chocolate2 = new Chocolate("Dark Chocolate", 40);
	        cart.addItemToCart(chocolate2);
	        cart.addItemToCart(chocolate);

	        Biscuit biscuit = new Biscuit("JimJam", 20);
	        cart.addItemToCart(biscuit);

	        Hat hat = new Hat("Baseball Cap", "Cap", 30,10);
	        HatAdapter hatAdapter = new HatAdapter(hat);
	        cart.addItemToCart(hatAdapter);

	        System.out.println("Items in Cart:");
	        for (ITem item : cart.getCartItems()) {
	            System.out.println(item.getItemName() + ": Rs " + item.getItemPrice());
	        }

	        System.out.println("Total Cart Price: Rs " + cart.getCartPrice());
	    }
	}


