package comp.techlabs.list.test;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//List<Integer> integer = Arrays.asList(10,20,30,40,50);
		//ArrayList list = new ArrayList();
		list.add("Mrunalini");
		list.add("Sanjay");
		list.add("Sonawane");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
		
		
		for(String name:list) {
			System.out.println(name);
			
			
		}
		System.out.println("Using Iterator");
		Iterator <String> iterator=list.listIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Using list iterator");
		ListIterator<String> listIterator = list.listIterator();
		
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
	}

}
