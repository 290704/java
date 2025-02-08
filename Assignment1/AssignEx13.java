package Assignment1;
class Shape3{
	 double getCircle() {
		return 0;
	}
}
class Circle3 extends Shape3{
	 private double radius;
	
	Circle3(double radius){
		this.radius=radius;
	}
	double getCircle() {
		return Math.PI*radius*radius;
	}
	
	void dispaly() {
		System.out.println("Area of circumferene of circle:"+radius);
	}
	
}
public class AssignEx13 {
	public static void main(String args[]) {
		Circle3 cir=new Circle3(30);
		cir.dispaly();
		System.out.println("Circumference of Circle:"+cir.getCircle());
	}

}
