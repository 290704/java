package com.celcom.day4;

public class MethodOverloadingEx1 {
	void myMethod(int a) {
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
	}
	void myMethod(int a,int b) {
		int sum=a+b;
		System.out.println("Addition:"+sum);
	}
	void myMethod(String name) {
		
		System.out.println("I am priyasakthi:"+name);
	}
	public static void main(String args[]) {
		MethodOverloadingEx1 obj=new MethodOverloadingEx1();
		obj. myMethod(5);
		obj. myMethod("software developer");
		obj. myMethod(10,20);
		
		
		
	}

}
