package com.celcom.day2;

public class TypesOfMethods {
	void m1() {
		System.out.println("Instance Method");
		
	}
	static void m2() {
		System.out.println("Static Method");
	}
	

	public static void main(String args[]) {
		TypesOfMethods obj=new TypesOfMethods();
		obj.m1();
		
		System.out.println(TypesOfMethods.m2());

}}
