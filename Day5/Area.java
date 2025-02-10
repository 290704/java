package com.celcom.day5;



interface Area1{
	void display();
}
interface Perimeter{
	void perimeter();
}
abstract class Shape implements Area1{
	    String name;

	    Shape(String name) {
	        this.name = name;
	    }

	   
	    double calculateArea() {
	        return 0.0;
	    }

	  
	    public void display() {
	        System.out.println("Shape: " + name);
	        System.out.println("Area: " + calculateArea());
	    }
	}

  class Rectangle4{
	private double width;
	private double height;
	
	Rectangle4(double width,double height){
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
class Circle extends Shape {
	    double radius;

	
	    Circle(double radius) {
	        super("Circle");
	        this.radius = radius;
	    }

	  
	     public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}


class Rectangle extends Shape {
	    double length, width;

	    Rectangle(double length, double width) {
	        super("Rectangle");
	        this.length = length;
	        this.width = width;
	    }

	  
	    public double calculateArea() {
	        return length * width;
	    }
	}

	
class Triangle extends Shape {
	    double base, height;

	  
	    Triangle(double base, double height) {
	        super("Triangle");
	        this.base = base;
	        this.height = height;
	    }

	    
	    public double calculateArea() {
	        return 0.5 * base * height;
	    }
	    
	}

	
abstract public class Area {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(4, 6);
	        Triangle triangle = new Triangle(3, 7);

	       
	        circle.display();
	        rectangle.display();
	        triangle.display();
	        
	        Rectangle4 rect1=new Rectangle4(10,20);
			System.out.println("Area:"+rect1.getArea());
			System.out.println("Perimeter:"+rect1.getPerimeter());
	    }
	}




