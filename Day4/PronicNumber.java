package com.celcom.day4;

public class PronicNumber {
	public static boolean isPronic(int num) {
		
	        if (num < 0) {
	            return false;
	        }

	        for (int i = 0; i <= Math.sqrt(num); i++) {
	            if (i *(i + 1) == num) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int number = 6;
	        

	        if (isPronic(number)) {
	            System.out.println(number + " is a pronic number.");
	        } else {
	            System.out.println(number + " is not a pronic number.");
	        }
	    }
	}

