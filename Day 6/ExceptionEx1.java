package com.celcom.day6;

public class ExceptionEx1 {

	public static void main(String[] args) {
	System.out.println("Before Exception");
	
//	int a=10/0;      //arithmetic exception
	
//	int arr[]=new int[-5]; //negativearraysize  exception
	
//	int arr[]= {10,20,30};
//	System.out.println(arr[3]);  //ArrayIndexOutOfbound Exception
	
//	int a=Integer.parseInt("ABC");  //NumberFormat Exception
	
//	Object o=new ExceptionEx1();   //DMD
	
	ExceptionEx1 o=(ExceptionEx1) new Object();  //Reverse DMD is not possible ClassCastException
	
	System.out.println("After Exception");
	

	}

}
