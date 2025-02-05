package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingEx {
	public static void main(String args[]) {
		int arr[]= {2,6,8,4,7,9};
		//ascending order
		Arrays.sort(arr);
		for(int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
	System.out.println("\n Minimum Value:"+arr[0]);
	System.out.println("Second Minimum Value:"+arr[1]);
	System.out.println("Maximum Value:"+arr[arr.length-1]);
	System.out.println("Second Maximum Value:"+arr[arr.length-2]);
	//Descending order
	for(int index=arr.length-1;index>=0;index--) {
		System.out.print(arr[index]+" ");
	}

}
}