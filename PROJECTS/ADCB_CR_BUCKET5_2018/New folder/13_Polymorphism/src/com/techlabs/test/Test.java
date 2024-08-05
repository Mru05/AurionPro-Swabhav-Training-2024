package com.techlabs.test;

import com.techlabs.model.Base;
import com.techlabs.model.Derieved1;
import com.techlabs.model.Derieved2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.display();
		b =new Derieved1();
		b.display();
		b =new Derieved2();
		b.display();

	}

}
