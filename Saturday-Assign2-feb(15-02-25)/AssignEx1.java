package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignEx1 {

	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Apple");
	list.add("Mango");
	list.add("Orange");
	list.add("PineApple");
	list.add("GooseBerry");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the search elements:");
	String searchElement=scanner.next();
	
	if(list.contains(searchElement)) {
		System.out.println(searchElement+" is found in the array list "+list.indexOf(searchElement));
		
	}else {
		System.out.println(searchElement+"is not found in the array list");

	}

}
}
