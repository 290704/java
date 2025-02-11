package com.celcom.day6;

public class ObjectAssigningEx1 {
	public static void main(String args[]) {
		
		 ObjectAssigningEx1 obj1=new  ObjectAssigningEx1();
		 System.out.println(obj1.hashCode());
		 
		 ObjectAssigningEx1 obj2=obj1; //object assignment(single copy)
		 System.out.println(obj2.hashCode());
	}

}
