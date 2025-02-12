package com.celcom.day7;

public class InnerClassEx1 {
	
	//1.Non-static Inner class
			class InnerClass1{
				void myMethod1() {
					System.out.println("Non-static Inner class");
				}
			}
			
	//2.static Inner class
			static class InnerClass2{
				void myMethod2() {
					System.out.println("static Inner class");
				}
			}
			
	void myMethod() {
		//3.local inner class
		class InnerClass3{
			void myMethod3() {
				System.out.println("local Inner class");
			}
		}
		InnerClass3 inner3=new InnerClass3();
		inner3.myMethod3();
	}
	public static void main(String[] args) {
		
		InnerClassEx1 obj1=new InnerClassEx1();
		InnerClass1 inner1= obj1.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassEx1.InnerClass2 inner2=new InnerClassEx1.InnerClass2();
		inner2.myMethod2();
		
		
		}

	

}
