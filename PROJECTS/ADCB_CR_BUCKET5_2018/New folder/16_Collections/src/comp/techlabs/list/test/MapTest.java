package comp.techlabs.list.test;

import java.util.*;
import java.util.Map.Entry;


public class MapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5, "chirag");
		map.put(4, "Shirish");
		map.put(7, "Vinayak");
		
		System.out.println(map);
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		for(Entry<Integer,String> entry:entries)
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
