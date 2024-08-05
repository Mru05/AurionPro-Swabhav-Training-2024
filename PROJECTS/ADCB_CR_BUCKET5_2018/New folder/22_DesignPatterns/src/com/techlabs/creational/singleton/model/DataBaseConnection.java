package com.techlabs.creational.singleton.model;

public class DataBaseConnection {
	private static DataBaseConnection databaseConnection;
	
	public static DataBaseConnection getDatabaseConnection() {
		if(databaseConnection==null)
			databaseConnection = new DataBaseConnection();
		return databaseConnection;
	}
	
	private DataBaseConnection(){
		
		System.out.println("data base successfully created");
		
	}
	public void status() {
		System.out.println("Database successfully connected");
	}

}
