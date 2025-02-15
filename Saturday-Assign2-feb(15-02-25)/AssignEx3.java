package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("Priya");
		list1.add("sudha");
		list1.add("Rajii");
		list1.add("Sakthi");
		list1.add("arivu");
		
		List<String> list2=new ArrayList<>(list1.size());
		
		for(int i=0;i<list1.size();i++) {
			list2.add(null);
		}
		Collections.copy(list2, list1);
		
		System.out.println("Original Array of Elements:"+list1);
		System.out.println("Copied Array of Elements:"+list2);
	}

}
