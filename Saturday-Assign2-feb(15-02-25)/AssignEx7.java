package com.celcom.assignment2;

import java.util.LinkedList;

public class AssignEx7 {

	public static void main(String[] args) {
		 LinkedList<String> list=new LinkedList<>();
		 list.add("Priya");
		 list.add("Sakthi");
		 list.add("Rajii");
		 list.add("Mango");
		 list.add("Sudha");
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println("linked list element position " +i+" is : "+list.get(i));
		 }

	}

}
