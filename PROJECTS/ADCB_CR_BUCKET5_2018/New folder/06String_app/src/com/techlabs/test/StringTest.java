package com.techlabs.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 ="Mrunalini";
		String name2 ="Mrunalini";
		String name3= new String("Mru");
		String name4= new String("Mru");
		StringBuffer name5 = new StringBuffer("Mrunalini");
		System.out.println(name5.hashCode());//String buffer is mutable
		name5 = name5.append("Sonu");
		System.out.println(name5.hashCode());
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println("onli string "+name1==name2);
		System.out.println("String new"+name3==name4);
		System.out.println("Name3 : "+name3.hashCode());
		System.out.println("Name4 :"+name4.hashCode());
		
		name1=name1+"Sonawane";
		System.out.println(name1.hashCode());//Strings are immutable cannot change the content of strings
		StringBuilder name6 = new StringBuilder("Sanjay");
		System.out.println("Stringbuilder"+name6.hashCode());
		name6 = name6.append("SOnawane");
		System.out.println(""+name6.hashCode());//mutable

	}

}
