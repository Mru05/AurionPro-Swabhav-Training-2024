package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.DataBaseConnection;

public class DataBaseConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseConnection databaseConnection1= DataBaseConnection.getDatabaseConnection();
		databaseConnection1.status();
	
		System.out.println(databaseConnection1.hashCode());
		DataBaseConnection databaseConnection2= DataBaseConnection.getDatabaseConnection();
		databaseConnection2.status();
		System.out.println(databaseConnection2.hashCode());
		

	}

}
