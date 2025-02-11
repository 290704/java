package com.celcom.day6;

public class GarbageCollectionEx {
	//variable
	static int count;
	//constructor can create with the help of object
	GarbageCollectionEx(){
		count++;
		System.out.println(count);
		
	}
//	@override
	//finalize method (deleting the object)
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	public static void main(String args[]) {
		GarbageCollectionEx obj1=new GarbageCollectionEx();
		GarbageCollectionEx obj2=new GarbageCollectionEx();
		obj1=null;
		System.gc();
		obj2=null;
		Runtime.getRuntime().gc();
	}

}
