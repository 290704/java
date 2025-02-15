package com.celcom.assignment2;

import java.util.LinkedList;

public class AssignEx9 {

	public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<>();
	list.add(19);
	list.add(20);
	list.add(78);
	list.add(90);
	list.add(56);
	
	System.out.println("Display elements with their position:");
	for(int i=0;i<list.size();i++) {
		System.out.println("Position "+i+ " is :" +list.get(i));
	}

	}

}
