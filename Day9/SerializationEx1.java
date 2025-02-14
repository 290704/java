package com.celcom.day9;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

class Employee implements Serializable{
	transient public int eid;
	private String ename;
	private double esalary;
	
	public Employee(int eid,String ename,double esalary) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String toString() {
		return "Employee[eid="+eid+",ename="+ename+",esalary="+esalary+"]";
	}
	
	
}
public class SerializationEx1 {

	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
		Employee obj1=new Employee(101,"Priya",45000);
		
		//Serialization
		FileOutputStream fout=new FileOutputStream("D://UserInputEx.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(obj1);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-serialization
		FileInputStream fin=new FileInputStream("D://UserInputEx.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp=(Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
		
	}

}
