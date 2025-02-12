package com.celcom.day7;

interface Calculator{
	int calc(int a,int b);
}
public class LambdaExpressionEx {

	public static void main(String[] args) {
		Calculator c=(a,b)->a+b;
		c.calc(10,20);//30
		System.out.println("Addition:"+c.calc(10,20));
		
		c=(a,b)->a-b;
		c.calc(10,20);//-10
		System.out.println("Subtraction:"+c.calc(10,20));

	}

}
