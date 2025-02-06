package com.celcom.day3;


	class Shape{
	    String name;

	    Shape(String name) {
	        this.name = name;
	    }

	   
	    double calculateArea() {
	        return 0.0;
	    }

	  
	    void display() {
	        System.out.println("Shape: " + name);
	        System.out.println("Area: " + calculateArea());
	    }
	}



	class Circle extends Shape {
	    double radius;

	
	    Circle(double radius) {
	        super("Circle");
	        this.radius = radius;
	    }

	  
	    double calculateArea() {
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

	  
	    double calculateArea() {
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

	    
	    double calculateArea() {
	        return 0.5 * base * height;
	    }
	    
	}

	
	public class Area {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(4, 6);
	        Triangle triangle = new Triangle(3, 7);

	       
	        circle.display();
	        rectangle.display();
	        triangle.display();
	    }
	}




