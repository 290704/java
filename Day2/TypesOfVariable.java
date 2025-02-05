package com.celcom.day2;

public class TypesOfVariable {
	
		int b=20;//instance variable
		static int c=40;//static variable
		public static void main(String args[]) {
			int a=100;//local variable
			System.out.println(a);
			
			TypesOfVariable obj=new TypesOfVariable();
			System.out.println(obj.b);
			
			System.out.println(TypesOfVariable.c);
		
	}
}
