package com.celcom.day4;
class SuperClass{
	void myMethod() {
		System.out.println("i am super class");
	}
}
class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("i am sub class");
	}
}
	public class MethodOverridingEx1 {
	public static void main(String args[]) {
		SubClass obj=new SubClass();
		obj.myMethod();
		
		SuperClass obj1=new SubClass();//DMD
		obj1.myMethod();
	}
}
