package Assignment1;
class Vehicle{
	void drive() {
		System.out.println("I can drive ");
		
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a Car");
	}
}
public class AssignEx9 {
	public static void main(String args[]) {
		Vehicle vehicle=new Car();
		vehicle.drive();
		
	}

}
