package com.celcom.day10;

import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 


class Task1 implements Runnable 
{ 
	private String name; 
	
	public Task1(String s) 
	{ 
		name = s; 
	} 
	

	public void run() 
	{ 
		try
		{ 
			for (int i = 0; i<=5; i++) 
			{ 
				if (i==0) 
				{ 
					Date d = new Date(); 
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
					System.out.println("Initialization Time for"
							+ " task name - "+ name +" = " +ft.format(d)); 
					 
				} 
				else
				{ 
					Date d = new Date(); 
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
					System.out.println("Executing Time for task name - "+ 
							name +" = " +ft.format(d)); 
				
				} 
				Thread.sleep(1000); 
			} 
			System.out.println(name+" complete"); 
		} 
		
		catch(InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
public class Example1
{ 
	
	static final int MAX_T = 3;			 

	public static void main(String[] args) 
	{ 

		Runnable r1 = new Task1("task 1"); 
		Runnable r2 = new Task1("task 2"); 
		Runnable r3 = new Task1("task 3"); 
		Runnable r4 = new Task1("task 4"); 
		Runnable r5 = new Task1("task 5");	 
		

		ExecutorService pool = Executors.newFixedThreadPool(MAX_T); 
		
	 
		pool.execute(r1); 
		pool.execute(r2); 
		pool.execute(r3); 
		pool.execute(r4); 
		pool.execute(r5); 
		
 
		pool.shutdown();	 
	} 
} 
