package com.celcom.day1;

public class FactorialTable {
	

	public static void main(String[] args) {

		        int n = 10;  
		        System.out.println("Factorial Table:");
		        for (int i = 1; i <= n; i++) {
		            System.out.println(i + "! = " + factorial(i));
		        }
		    }
		    public static long factorial(int num) {
		        long fact = 1;
		        for (int i = 1; i <= num; i++) {
		            fact *= i;
		        }
		        return fact;
		    }
		}

