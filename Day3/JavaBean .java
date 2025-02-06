package com.celcom.day3;


class Employee{
	//variables
	private int eid;
	private String name;
	private int salary;
	
	
	public Employee() {
		
	}

	public Employee(int eid, String name, int salary) {
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	//getter
	public int getEid() {
		return eid;
	}

	//setter
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
public class JavaBean {
	public static void main(String args[]) {
		Employee obj=new Employee();
	}

}
