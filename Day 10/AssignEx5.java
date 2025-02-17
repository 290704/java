package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(49);
		list.add(13);
		list.add(35);
		
		System.out.println("Original List:"+list);
		Collections.sort(list);
		System.out.println("Sorted List:"+list);
		
		Collections.reverse(list);
		System.out.println("Reverse order of list:"+list);

	}

}
