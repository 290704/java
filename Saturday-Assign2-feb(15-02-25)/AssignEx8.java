package com.celcom.assignment2;

import java.util.Collections;
import java.util.LinkedList;

public class AssignEx8 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(89);
		list.add(78);
		list.add(23);
		list.add(34);
		list.add(67);
		System.out.println("Original linked list are:"+list);
		Collections.reverse(list);
		System.out.println("Reverse linked list are:"+list);

	}

}
