package com.celcom.day3;


class Vehicle1 {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}

class TwoWheeler1 extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two wheels");
	}

}

class Bike1 extends TwoWheeler1 {
	void brandName() {
		System.out.println("I am splender");
	}
}

class Scooty extends Bike1 {
	void brandName() {
		System.out.println("I am honda");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Bike1 obj1=new Bike1();
		obj1.noOfEngine();
		obj1.noOfWheels();
		obj1.brandName();
		
		Scooty obj=new Scooty();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
	}

}
