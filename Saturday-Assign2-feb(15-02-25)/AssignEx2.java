package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignEx2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(40);
		list.add(70);
		System.out.println("Original list "+list);
		Collections.sort(list);
		System.out.println("Sorted list "+list);
		

	}

}
