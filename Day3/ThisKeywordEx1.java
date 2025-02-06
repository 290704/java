package com.celcom.day3;

public class ThisKeywordEx1 {
	//variables
	String name;
	
	//default constructor
	
	ThisKeywordEx1(){
//		System.out.println("test");
		this("priya");
	}
	
	//parameter constructor
	ThisKeywordEx1(String name){
		this.name=name;
	}
	//methods
	void greetings() {
		System.out.println("welcome to our Office:"+name);
	}
	
	//object creation
	public static void main(String args[]) {
		ThisKeywordEx1 obj=new ThisKeywordEx1("priya");
		obj.greetings();
		
	}
}
