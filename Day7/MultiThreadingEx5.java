package com.celcom.day7;

class TwoTable extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println( i +"*2=" +(i*2));
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
				}
			
		}
	}
}

class FiveTable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.err.println( i +"*5=" +(i*5));
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
				}
			
		}
	}
}
public class MultiThreadingEx5 {

	public static void main(String[] args) throws InterruptedException {
	TwoTable obj1=new TwoTable();
	obj1.start();
	obj1.join();
	System.out.println("Main");
	Thread obj2=new Thread(new FiveTable());
	obj2.start();
	}

}
