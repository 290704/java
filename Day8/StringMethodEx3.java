package com.celcom.day8;
// strings are immutable object like array
 //stringBuffers,stringBuilder are mutable 
public class StringMethodEx3 {

	public static void main(String[] args) {
	
		
		String s1="java";
		s1=s1.concat("world");
		System.out.println(s1);
		
		
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb.capacity());
		sb.append("world");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("java");
		sb1.append("world");
		System.out.println(sb1);
	}

}
