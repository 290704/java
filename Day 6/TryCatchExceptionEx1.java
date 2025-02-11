package com.celcom.day6;

public class TryCatchExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int a=10/0;  //arithmetic exception
//			int a=Integer.parseInt("hello"); //number format exception
			
//			int arr[]=new int[-5];  //negativeArraysize exception
			
//			int arr[]= {10,20,30};
//			System.out.println(arr[3]);
			System.out.println("hi");
		}catch(ArithmeticException e) {
			System.out.println("A");
			try {
				int a=Integer.parseInt("hello");
			}catch(NumberFormatException e1) {
				System.out.println("E");
			}
		}catch(NumberFormatException e) {
			System.out.println("B");
		}catch(NegativeArraySizeException e) {
			System.out.println("C");
		}catch(Exception e) {   //super class for all exception
			System.out.println("D");
		}finally {
			System.out.println("Inside Finally");
		}
		
		
		System.out.println("After Exception");

	}

}
