package Assignment1;

class Circle{
	private double radius;
	
	Circle(double radius){
		this .radius=radius;
	}
	
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	
	double getArea() {
		return Math.PI*radius*radius;
	}
	double getCircumference() {
		return 2*Math.PI*radius;
	}
}
public class AssignEx4 {
	public static void main(String args[]) {
		Circle cir=new Circle(10);
		System.out.println("Area of Circle:"+cir.getArea());
		System.out.println("Circumference of the circle:"+cir.getCircumference());
		
	}

}
