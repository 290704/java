package Assignment1;
class Shape{
	double getArea() {
		return 0;
	}
}
class Rectangle1 extends Vehicle {
	private double length;
	private double width;
	
	Rectangle1(double length,double width){
		this.length=length;
		this.width=width;
	}
	double getArea() {
		return length*width;
	}
	 
}
		

public class AssignEx10 {
	public static void main(String args[]) {
		Rectangle1 rect=new Rectangle1(10,20);
		System.out.println("Area of Rectangle:"+rect.getArea());
		
	}

}
