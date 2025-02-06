package com.celcom.day3;

class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A1");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("B");
	}
	B(int a){
		super(10);
		System.out.println("B1");
	}
}
public class SuperKeywordEx1 {
	public static void main(String[] args) {
		B b=new B();
	}
}
