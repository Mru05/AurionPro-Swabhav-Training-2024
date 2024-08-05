package comp.techlabs.list.test;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=  new LinkedList<String>();

		list.add("Vinayak");

		list.add("Devansh");

		list.addFirst("Shivam");

		list.addLast("Aagya");

		for(String name:list) System.out.println(name);

	}

}
