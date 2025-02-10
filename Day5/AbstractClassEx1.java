package com.celcom.day5;

//interface 
interface VehiclePlan {
	void noOfEngine();//public abstract
	void brandName();
	void noOfWheels();
}
interface VehiclePlan1{
	void noOfEngine();//public abstract
	
}
interface VehiclePlan2 {
	void brandName();
	void noOfWheels();
}

//abstract class
abstract class Vehicle implements VehiclePlan{
	public void noOfEngine() {
		System.out.println("I have one engine");
	}
//	public abstract void noOfWheels();
//	public abstract void brandName();
}
class Car extends Vehicle{
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
	public void brandName() {
		System.out.println("my brand name is benz");
	}  
}
//concrete class
abstract public class AbstractClassEx1 {

	public static void main(String[] args) {
		Vehicle vec=new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}

}
