Daypackage com.celcom.day4;

public class JavaBlock {
	//instance block
	{
		System.out.println("Instance block");
	}
	//constructor block
	 JavaBlock(){
		 System.out.println("Constructor");
	 }
//	 @override toString
	 public String toString() {
		 return "to String";
	 }
	 
	 
	 
	 //static block
	static{
		System.out.println("static block");
	}
	
	
	//output
	
//	static block
//	Main Method block
//	Instance block
//	Constructor
//	to String
	public static void main(String args[]) {
		System.out.println("Main Method block");
		JavaBlock obj=new JavaBlock();
		System.out.println(obj);
	}

}



