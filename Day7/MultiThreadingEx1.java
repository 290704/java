package com.celcom.day7;

public class MultiThreadingEx1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		System.out.println("current thread name:"+t.getName());
		System.out.println("current thread priority:"+t.getPriority());

	}

}
