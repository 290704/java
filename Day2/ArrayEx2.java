package com.celcom.day2;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String args[]) {
		int arr[]=new int[5];
		int sum=0,evencount=0,oddcount=0;
		System.out.println("Initial Values of an array");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 values");
		for(int index=0;index<arr.length;index++) {
			arr[index]=sc.nextInt();
		}
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[index];
			
			if(arr[index]%2==0)
				evencount++;
			else
				oddcount++;
		}
		System.out.println("Sum Array:"+sum);
		System.out.println("Event count"+evencount);
		System.out.println("odd count:"+oddcount);
	}
}
