package com.celcom.day7;

interface MyInterface{
	void display();
}
public class AnonymousInnerClass implements MyInterface{
	
	public void display() {
		System.out.println("Annonymous Inner class");
	}
	public static void main(String args[]) {
		AnonymousInnerClass obj=new AnonymousInnerClass();
		obj.display();
		//annonymous inner class implement without any class
		MyInterface obj1=new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		obj1.display();
		
		//lambda expression
		MyInterface obj2=()->System.out.println("Display");
		obj2.display();
		
		
	}

}
