package com.celcom.day2;

class Fruits{
	String color;
	int price;
	int size;
	
	//constructor
	Fruits(String color,int price,int size){
		this.color=color;
		this.price=price;
		this.size=size;
	}
	
	//Method
	void display() {
		System.out.println("Fruit color:"+color);
		System.out.println("Fruit price:"+price);
		System.out.println("Fruit size:"+size);
	}
	void setPrice(int price) {
		this.price=price;
	}
}


public class ClassAndObjectEx2 {
	public static void main(String args[]) {
		Fruits apple=new Fruits("red",40,20);
		apple.display();
		
		apple.setPrice(300);
		apple.display();
	}
}
