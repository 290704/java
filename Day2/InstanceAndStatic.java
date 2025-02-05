package com.celcom.day2;

public class InstanceAndStatic {
	// instance
	static int a = 10;

	public static void main(String args[]) {
		InstanceAndStatic obj1 = new InstanceAndStatic();
		InstanceAndStatic obj2 = new InstanceAndStatic();

		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
