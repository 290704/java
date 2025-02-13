package com.celcom.day8;

public class StringMethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Priya";
		System.out.println(s1.length());//5
		System.out.println(s1.charAt(1));//r
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.concat("is a Developer"));
		System.out.println(s1.replace('a','z'));//priyz
		
		System.out.println(s1.equals("priya"));//false
		System.out.println(s1.equalsIgnoreCase("priya"));//true
		System.out.println(s1.contains("ri"));//true
		System.out.println(s1.startsWith("pri"));//true
		System.out.println(s1.endsWith("ya"));//true
		
		String s2="Java world ";
		System.out.println(s2.substring(2,7));//va wo
		System.out.println(s2.substring(2));//va world
	}

}
