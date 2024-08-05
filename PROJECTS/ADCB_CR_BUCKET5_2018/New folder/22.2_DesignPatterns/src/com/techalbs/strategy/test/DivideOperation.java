package com.techalbs.strategy.test;

import com.techlabs.strategy.model.IOperation;

public class DivideOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
