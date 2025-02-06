package com.celcom.day3;
class Vehicle3 {
	String name="Priyasakthi";
	
	Vehicle3(){
		System.out.println("I am a super class variable");
	}
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}

class TwoWheeler3 extends Vehicle3 {
	TwoWheeler3(){
		super();
	}
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have two wheels");
		System.out.println(super.name);
	}

}

public class SuperKeyword {
	public static void main(String args[]) {
		TwoWheeler3 obj=new TwoWheeler3();
		obj.noOfEngine();
		obj.noOfWheels();
	}

}
