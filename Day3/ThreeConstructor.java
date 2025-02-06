package com.celcom.day3;

public class ThreeConstructor {
	
	ThreeConstructor(){
		this("Priya");
		System.out.println("A");
		
	}
	

	ThreeConstructor(String name){
		this(37);
		System.out.println("B");
		
	}

	ThreeConstructor(int a){
		System.out.println("C");
		
	}
	
	public static void main(String args[]) {
		ThreeConstructor obj=new ThreeConstructor();
	}

}
