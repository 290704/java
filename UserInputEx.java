 package com.celcom.day1;
 import java.util.Scanner;

 public class UserInputEx{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id,name,salary");
		int eid=sc.nextInt();
		String ename=sc.next();
		double esalary=sc.nextDouble();
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+esalary);



}
}