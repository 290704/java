package com.celcom.assignment2;

import java.util.LinkedList;
import java.util.Iterator;

public class AssignEx6 {

	public static void main(String[] args) {
	 LinkedList<String> list=new LinkedList<>();
	 list.add("Priya");
	 list.add("Sakthi");
	 list.add("RAjii");
	 list.add("Mango");
	 list.add("Sudha");
	 
//	 for(int i=0;i<list.size();i++) {
//		 System.out.println("linked list elements are:"+list.get(i));
//	 }
	 
	 Iterator<String> it=list.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 

	}

}
