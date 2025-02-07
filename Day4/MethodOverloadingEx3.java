package com.celcom.day4;

public class MethodOverloadingEx3 {
	void concat(String a,String b) {
		System.out.println("two string:"+(a+b));
	}
	void concat(int a,int b) {
		System.out.println("two integer:"+ (a +""+ b));
	}
	void concat(float a,float b) {
		System.out.println("Two float:"+(a+""+b));
	}
	public static void main(String args[]) {
		MethodOverloadingEx3 obj=new MethodOverloadingEx3();
		obj.concat("priya","sakthi");
		obj.concat(110,120);
		obj.concat(10.0f,6.30f);
	}

}
