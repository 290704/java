package com.celcom.day4;

class Animal2{
	String msg=getMessage();
	String getMessage() {
		return "A";
	}
}
class Dog2 extends Animal2{
	String getMessage() {
		return "B";
	}
	
}
public class MethodOverridingEx4 {
	public static void main(String args[]) {
		Animal2 animal=new Dog2();
		System.out.println(animal.msg);//B  method can override the superclass
		
		//Final keyword
		
		final int a=10;//unchangeable,cannot override,inherit from superclass by using super keyword
	}

}
