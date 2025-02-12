package com.celcom.day7;

class MyThread1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("My Thread is Running....");
			try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class MultiThreadingEx3 {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread());
		System.out.println(t1.getState());
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start();//starting or running my thread T1
		Thread.sleep(3000);
		System.out.println("Main end");
		
		t1.suspend();//waiting state
		System.out.println(t1.getState());
		
		t1.resume();
		
		
	}


}
