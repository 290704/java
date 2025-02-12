package com.celcom.main;



//normal import
import java.lang.Math;
//static import
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;

//we can import concrete class 1 and concrete class2
import com.celcom.pack1.MyConcreteClass;
import com.celcom.pack2.MyConcreteClass2;

public class MainClass {
  static int a=20;
	public static void main(String[] args) {
		MyConcreteClass obj1=new MyConcreteClass();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyConcreteClass2 obj2=new MyConcreteClass2();
		obj2.myMethod3();
		
		out.println(Math.PI);
		
		System.out.println(PI);
		System.out.println(a);
		
		int a=parseInt("ABC");
	}

}
