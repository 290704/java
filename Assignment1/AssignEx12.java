package Assignment1;
class Animal3{
	void makeSound() {
		System.out.println("Animal can make a sound in forest");
		
	}
	void color() {
		System.out.println("Animal color is yellow");
	}
	void activity() {
		System.out.println("Animal activity is eat and sleep peace fully");
	}
}
class Dog1 extends Animal3{
	void makeSound() {
		System.out.println("dog can bark at seen a unknown person");
	}
	void color() {
		System.out.println("dog color is white and black");
		
	}
	void activity() {
		System.out.println("dog activity is bark in the road");
	}
}
public class AssignEx12 {
	public static void main(String args[]) {
		Animal3 myanimal=new Animal3();
		myanimal.makeSound();
		myanimal.color();
		myanimal.activity();
		
		Animal3 mydog=new Dog1();
		mydog.makeSound();
		mydog.color();
		mydog.activity();
		
		
		Dog1 dog=new Dog1();
		dog.activity();
		dog.color();
		dog.makeSound();
		
		
		
	}

}
