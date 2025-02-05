package com.celcom.day2;

class Employee{
	//Variable
	int eid=100;
	String ename="priya";
	double esalary=10000;
	//constructor
	Employee(int eid,String ename,double esalary){
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	//Method
	void display() {
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
	}
}

public class ClassAndObjectEx1 {
	public static void main(String args[]) {
		Employee priya=new Employee(100,"priya",10000);
		priya.display();
		
		Employee sakthi=new Employee(150,"sakthi",2000);
		sakthi.display();
	}
}
