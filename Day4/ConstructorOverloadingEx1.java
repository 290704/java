package com.celcom.day4;

public class ConstructorOverloadingEx1 {
	ConstructorOverloadingEx1(String a,String b) {
		 this(10,20);
		System.out.println("two string:"+(a+b));
	}
	ConstructorOverloadingEx1(int a,int b) {
	     this(34f,12f);
		System.out.println("two integer:"+ (a + b));
	}
	ConstructorOverloadingEx1(float a,float b) {
		System.out.println("Two float:"+(a+b));
	}
	public static void main(String args[]) {
		ConstructorOverloadingEx1 obj1=new ConstructorOverloadingEx1("priya","sakthi");
//		ConstructorOverloadingEx1 obj2=new ConstructorOverloadingEx1(10,20);
//	ConstructorOverloadingEx1 obj3=new ConstructorOverloadingEx1(34f,12f);
		
	}
}
