
package com.celcom.day2;

public class ArrayEx1 {
	public static void main(String args[]) {
		int arr[]= {100,200,300,400,500};
		int sum=0;
		System.out.println("Array Length:"+arr.length);
		System.out.println("Array Elements:");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
			sum=sum+arr[index];
		}
		System.out.println("Sum of Array:"+sum);
		for(int value:arr) {
			System.out.println(value);
		}
	}

}

