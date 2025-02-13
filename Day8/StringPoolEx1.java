package com.celcom.day8;

public class StringPoolEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("java");
		String s2=new String("java");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false because new keyword create a 
		// new object so its take a new memory
		
		String s3="Java";
		String s4="Java";
		System.out.println(s3.equals(s4));//true
		System.out.println(s3==s4);//true

	}

}
