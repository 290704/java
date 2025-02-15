package Assignment1;
class Animal{
	void makeSound() {
		System.out.println("some generic sound");
		
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("bark");
	}
}
public class AssignEx8 {
	public static void main(String args[]) {
		Animal myanimal=new Animal();//DMD
		myanimal.makeSound();
		
		Animal mycat=new Cat();
		mycat.makeSound();
	}

}
