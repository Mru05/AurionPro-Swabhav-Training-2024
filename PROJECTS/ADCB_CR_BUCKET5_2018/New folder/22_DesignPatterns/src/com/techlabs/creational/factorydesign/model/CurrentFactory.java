package com.techlabs.creational.factorydesign.model;

import com.techlabs.creational.factorydesign.abstractfactory.IAccountFactory;

public class CurrentFactory implements IAccountFactory{

	@Override
	public IAccount createaccount() {
		// TODO Auto-generated method stub
		return new CurrentAccount(0);
	}

}
