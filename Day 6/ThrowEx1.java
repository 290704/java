package com.celcom.day6;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	//to create own Exception
//	int age;
//	InvalidAgeException(int age){
//		this.age=age;
//	}
	
	
	public String toString() {
	    return "Invalid Age for Voting";
	}
}
public class ThrowEx1 {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age=new Scanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcome to vote");
		}else {
			try {
				throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}

}
}
