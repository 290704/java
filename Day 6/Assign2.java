package com.celcom.day6;

	class NoVowelException extends Exception {
	    public NoVowelException(String s) {
	        super(s);
	    }
	}

	public class  Assign2 {
	    public static void checkForVowels(String str) throws NoVowelException {
	        if (!str.matches(".*[AEIOUaeiou].*")) {
	            throw new NoVowelException("No vowels found in the string.");
	        }
	        System.out.println("The string contains vowels.");
	    }

	    public static void main(String[] args) {
	        String str = "rthyms"; 
	        try {
	            checkForVowels(str);
	        } catch (NoVowelException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}


