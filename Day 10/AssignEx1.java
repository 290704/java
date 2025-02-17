package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class AssignEx1 {

	public static void main(String[] args) {
	  ArrayList<String> arraylist=new ArrayList<>();
	  arraylist.add("Priya");
	  arraylist.add("apple");
	  arraylist.add("mango");
	  arraylist.add("sudha");
	  arraylist.add("orange");
	  
	  LinkedList<String> linkedlist=new LinkedList<>(arraylist);
	  System.out.println("LinkedList :"+linkedlist);
	  

	}

}
