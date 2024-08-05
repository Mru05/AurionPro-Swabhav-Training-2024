package com.techlabs.builderPattern.test;

import com.techlabs.builderPattern.Phone;
import com.techlabs.builderPattern.PhoneBuilder;

public class Shop {
     public static void main(String[] args) {
    	 Phone p = new PhoneBuilder()
    			 .setRam(3)
    			 .setOs("Android")
    			 .getPhone();
    	 System.out.println(p);
	}
      
}
