package com.revature.driver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDriver {

	public static void main(String[] args) {
		
		String[] sarr = new String[]{"one", "two", "three"};
		
		System.out.println(sarr);
		
		/*for(String s : sarr){
			
			System.out.println(s);
			
		}*/
		
		//sarr[3] = "four";  Cannot resize an array
		
		List<String> l = new LinkedList<>();
		
		/*l.add("one");
		l.add("two");
		l.add("three");*/
		
		//      vvv--------utility class for working with Arrays
		l.addAll(Arrays.asList(sarr));
		
		//l.get(5).indexOf(6);
		
		System.out.println(l);
		
		Iterator<String> i = l.iterator();
		
		while(i.hasNext()){
			
			System.out.println("Using iterator: " + i.next());
			
		}

	}

}