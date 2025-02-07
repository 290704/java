package com.celcom.day4;
class Animal1{
	int a=10;
	 void move() {
		System.out.println("can not define");
	}
	
}
class Dog1 extends Animal1{
	int a=20;
	 void move() {
		System.out.println("Dog will move by walk ");
	}
	
}
public class MethodOverridingEx3 {
	public static void main(String args[]) {
		Animal1 animal=new Dog1();
		animal.move();
		System.out.println(animal.a);//10 because variable cannot override (superclass override the subclass)
	}
}
