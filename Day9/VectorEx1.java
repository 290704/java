package com.celcom.day9;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<>(3,2);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		//way1 to traverse the vector
				for(int i=0;i<vec.size();i++) {
					System.out.println(vec.get(i));
				}
				
				//way 2
				for(Integer i:vec) {
					System.out.println(i);
				}
				
				//way3   
				Enumeration<Integer> e=vec.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}

	}

}
