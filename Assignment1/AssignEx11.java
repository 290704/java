package Assignment1;
class Vehicle1{
	void drive() {
		System.out.println("I can driving a vehicle in a correct way of rules");
	}
	void brake() {
		System.out.println("Driver has forget to put a brake");
	}
}
class Car1 extends Vehicle1{
	void drive() {
		System.out.println(" I am driving a car in my road street");
	}
	void brake() {
		System.out.println("Driver put a brake at a time");
	}
}
public class AssignEx11 {
	public static void main(String args[]) {
		Vehicle1 myvehicle=new Car1();
		myvehicle.drive();
		myvehicle.brake();
		Vehicle1 mycar=new Vehicle1();
		mycar.drive();
		mycar.brake();
		
	}

}
