package Assignment1;


	class Person{
		String name;
		int age;
		
		Person(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		
		void display() {
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
		}
	}
	public class AssignEx1 {
		public static void main(String args[]) {
			Person person1=new Person("Priya",21);
			Person person2=new Person("Sakthi",25);
			person1.display();
			person2.display();
		}

	}


