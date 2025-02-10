package com.celcom.day5;

//multiple inheritance using interface
interface One{
	int a=10;//by default variable are public 
	
}
interface Two{
	int b=20;
}
interface Three extends One,Two{
	void addition();
}
 class Addition implements Three{
	public void addition() {
		System.out.println("Addition:"+(a+b));
	}
}
class Add extends Addition{
	public void addition() {
		System.out.println("Addition:"+(a+b));
	}
}
abstract public class InterfaceExample1 {
	public static void main(String args[]) {
		Addition add=new Addition();
		add.addition();
	}

}
