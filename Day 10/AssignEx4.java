package com.celcom.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignEx4 {

	public static void main(String[] args) {
		Integer[] arr1= {10,20,30,40,50};
		Integer[] arr2= {50,40,30,20,10};
		
		
		
		List<Integer> list1=Arrays.asList(arr1);
		List<Integer> list2=Arrays.asList(arr2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		boolean array=list1.equals(list2);
		System.out.println("Arrays are equals in the same elements:"+array);
		

	}

}
