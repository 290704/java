package com.celcom.day4;

public class SingletonPattern {
	

	    private static SingletonPattern instance;

	    private SingletonPattern() {
	    	System.out.println("Private Constructor");
	    }

	    public static SingletonPattern getInstance() {
	        if (instance == null) {
	            instance = new SingletonPattern();
	        }
	        return instance;
	    }
       public static void main(String args[]) {
    	   SingletonPattern obj=new SingletonPattern();
    	   System.out.println("It is a Singleton Pattern");
       }
	}

