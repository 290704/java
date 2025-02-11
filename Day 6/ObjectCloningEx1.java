package com.celcom.day6;

public class ObjectCloningEx1 implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ObjectCloningEx1 obj1=new  ObjectCloningEx1();
		 System.out.println(obj1.hashCode());
		 
		 ObjectCloningEx1 obj2=(ObjectCloningEx1) obj1.clone(); //object cloning (individual copy)
		 System.out.println(obj2.hashCode());

	}

}
