package com.celcom.day3;


  
	class Mobile{
		int mno;
		String model;
		String color;
		
		Mobile(int mno,String model,String color){
			this.mno=mno;
			this.model=model;
			this.color=color;
			
		}
		
		void display() {
			System.out.println("mobile number:"+mno);
			System.out.println("mobile model:"+model);
			System.out.println("mobile color:"+color);
		}
	}
	
	public class ClassAndObjectEx3 {	
	public static void main(String args[]) {
		Mobile vivo=new Mobile(100,"herohonda","yellow");
		vivo.display();
		
	}
}
