package com.celcom.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CollectionListEx1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);   //add at the end
		list.add(20);
		list.add(30);
//		list.add("java");
		list.add(10);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.add(1,15);//to add in 1st index using index
		System.out.println(list);
		
		list.set(1,150);
		System.out.println(list);
		
		list.remove(new Integer(10));//if you give 10 means its take as index
		//                        so give error its not a index it is object 
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		
		System.out.println(list.size());
		
	
		System.out.println(list.contains(20));
		
		
		System.out.println(list.isEmpty());
		
		//way1 to traverse the list
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//way 2
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//traverse the list using interface
		
		//way3   
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
