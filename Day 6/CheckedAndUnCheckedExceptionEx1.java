package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnCheckedExceptionEx1 {
	static void m1() throws FileNotFoundException{
		FileReader fr=new FileReader("Test.txt");
	}
	static void m2() {
		try {
			m1();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws FileNotFoundException{
		// Unchecked Exception
		
		int a=10/0;
		throw new ArithmeticException();
		
//		int arr[]=new int[-5];
//		int arr1[]= {10,20,30};
//		System.out.println(arr[3]);
//         int b=Integer.parseInt("Priya");
         
         //Checked Exception
		
//         FileReader fr=new FileReader("abc.txt");
		
		
		
	}

}
