package Assignment1;

class Rectangle{
	private double width;
	private double height;
	
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return 2*(width+height);
	}

	
}
public class AssignEx3 {
	public static void main(String args[]) {
		Rectangle rect1=new Rectangle(10,20);
		System.out.println("Area:"+rect1.getArea());
		System.out.println("Perimeter:"+rect1.getPerimeter());
	}

}
