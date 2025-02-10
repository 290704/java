package com.celcom.day5;

class Animal{
	 void move() {
		System.out.println("can not define");
	}
	void eat() {
		System.out.println("can not define");
	}
}
class Dog extends Animal{
	 void move() {
		System.out.println("Dog will move by walk ");
	}
	void eat() {
		System.out.println("Dog will eat bone");
	}
}
class Parrot extends Animal{
	void move() {
		System.out.println("parrot will move by fly");
	}
	void eat() {
		System.out.println("Parrot will eat seed");
	}
}
class Fish extends Animal{
	void move() {
		System.out.println("Fish will move by swim");
	}
	void eat() {
		System.out.println("Fish will eat sea plants");
	}
}
public class MethodOverridingEx2 {
	public static void main(String args[]) {
		Animal animal;//DMD
		
		animal =new Dog();
		animal.move();
		animal.eat();
		
		animal =new Parrot();
		animal.move();
		animal.eat();
		
		animal =new Fish();
		animal.move();
		animal.eat();
	}

}
