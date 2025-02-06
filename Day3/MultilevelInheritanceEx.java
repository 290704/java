package com.celcom.day3;

class Vehicles {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}

class TwoWheelers extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two wheels");
	}

}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("I am splender");
	}
}


public class MultilevelInheritanceEx {
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
		

	}

}
