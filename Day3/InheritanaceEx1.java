package com.celcom.day3;
//single inheritance
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
}

public class InheritanaceEx1 {

	public static void main(String[] args) {
		TwoWheeler obj=new TwoWheeler();
		obj.noOfEngine();
		obj.noOfWheels();

	}

}
