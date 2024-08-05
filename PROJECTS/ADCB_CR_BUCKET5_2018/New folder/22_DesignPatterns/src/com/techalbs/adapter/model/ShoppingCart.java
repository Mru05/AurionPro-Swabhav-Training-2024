package com.techalbs.adapter.model;

import java.util.ArrayList;
import java.util.List;

import com.techalbs.adapter.model.ITem;

public class ShoppingCart {
	private List<ITem> cartItem;

    public ShoppingCart() {
        cartItem = new ArrayList<>();
    }

    public void addItemToCart(ITem item) {
        cartItem.add(item);
    }

    public List<ITem> getCartItems() {
        return cartItem;
    }

    public double getCartPrice() {
        double total = 0;
        for (ITem item : cartItem) {
            total += item.getItemPrice();
        }
        return total;
    }
}

