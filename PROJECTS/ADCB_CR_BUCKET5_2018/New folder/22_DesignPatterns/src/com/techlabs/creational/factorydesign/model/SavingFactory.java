package com.techlabs.creational.factorydesign.model;

import com.techlabs.creational.factorydesign.abstractfactory.IAccountFactory;

public class SavingFactory implements IAccountFactory{

	@Override
	public IAccount createaccount() {
		// TODO Auto-generated method stub
		return new SavingAccount(0);
	}

}
