package com.techlabs.creational.singleton.model;

public class Login {
	
	private static Login login; //reference of login
	
	public static Login getLogin() {
		if(login==null)
		 login = new Login();
		 return login;
	}
	
	private Login() {
		System.out.println("Login created");
	}
	public void status() {
		System.out.println("Login Successful");
	}

}
