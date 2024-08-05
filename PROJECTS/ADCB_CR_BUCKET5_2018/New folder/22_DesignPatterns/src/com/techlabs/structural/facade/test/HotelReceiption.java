package com.techlabs.structural.facade.test;

import com.techlabs.structural.facade.model.IHotel;
import com.techlabs.structural.facade.model.IndianHotel;

public class HotelReceiption {
    public static void main(String[] args) {
        // Create an instance of IndianHotel
        IHotel indHotel = new IndianHotel();
        // Get the Indian menu
        indHotel.getmenu();
       
    }
}



