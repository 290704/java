package com.celcom.day4;

public class MethodOverloadingEx2 {
	
	void addition(int a,int b) {
		System.out.println("Integer:"+(a+b));
	}
	void addition(double a,double b) {
		System.out.println("Double:"+(a+b));
	}
	void addition(long a,long b) {
		System.out.println("Long:"+(a+b));
	}
	public static void main(String args[]) {
		MethodOverloadingEx2 obj=new MethodOverloadingEx2();
		obj.addition(5, 6);
		obj.addition(10.89, 45.36);
		obj.addition(788767788L, 56545L);
	}

}
