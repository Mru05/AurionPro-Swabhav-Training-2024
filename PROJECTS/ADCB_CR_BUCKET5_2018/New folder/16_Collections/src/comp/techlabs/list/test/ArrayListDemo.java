package comp.techlabs.list.test;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		list.add("Mrunalini");
		list.add("Smoky");
		System.out.println(list);
		list.add(1, "Sanjay");
		System.out.println(list);
		list.add(50);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.clone();
		System.out.println("This is clone "+list);
		list.addAll(list);
		System.out.println("This is all all"
				+list);
		list.isEmpty();
		System.out.println("This isempty"+list);
		
		
	}

}
