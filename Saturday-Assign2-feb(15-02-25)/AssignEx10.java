package com.celcom.assignment2;

import java.util.LinkedList;
import java.util.List;

public class AssignEx10 {

	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<>();
		list1.add(20);
		list1.add(18);
		list1.add(45);
		list1.add(100);
		list1.add(28);
		System.out.println("Original linked list are: "+list1);
		List<Integer> list2=new LinkedList<>(list1);
		for(int i=0;i<list1.size();i++) {
			
		}
		System.out.println("Copied linked list are :"+list2);
		

	}

}
