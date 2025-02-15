package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.List;

public class AssignEx5 {

	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Priya");
	list.add("Sudha");
	list.add("Sakthi");
	list.add("Balu");
	list.add("Arivu");
	  
	for(int i=0;i<list.size();i++) {
		System.out.println("Array element position of " +i+ " is: "+list.get(i));
	}

	}

}
