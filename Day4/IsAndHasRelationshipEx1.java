package com.celcom.day4;
class Vehicle{
	void engine() {
		System.out.println("All Vehicle has a engine");
	}
	void wheels() {
		System.out.println("All Vehicle has a wheels");
	}
}
class Wheels{
	void wheelModel() {
		System.out.println("Wheel Model is MRF");
	}
	
	void noOfWheels(String vehicleType) {
	 if(vehicleType.equals("Two wheeler")) {
		 System.out.println("I have two wheels");
	 }else if(vehicleType.equals("Four wheeler")) {
		 System.out.println("I have four wheels");
	 }
	 
	}
	
}
class Engine{
	void EngineModel() {
		System.out.println("Wheel Model is susjjs");
	}
	
//	void noOfEngine(String vehicleType) {
//		System.out.println("I have one Engine");
//	 
//	}
	
}
class Car extends Vehicle{       //IS-A relationship
	Wheels wheel=new Wheels();  //HAS_A
	Engine engine =new Engine();//HAS_A
	
	void engineModel() {
		engine.EngineModel();
	}
	void wheelModel() {
		wheel.wheelModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}
public class IsAndHasRelationshipEx1 {
	public static void main(String args[]) {
		Car car=new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.noOfWheels();
	
	}

}
