package Assignment1;

class Dog{
	private String name;
	private String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	
	String geName() {
		return name;
	}
	String getBreed() {
		return breed;
	}
	
	void setName(String name) {
		this.name=name;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Breed:"+breed);
	}
}
public class AssignEx2 {
	public static void main(String args[]) {
		Dog dog1=new Dog("charlie","Golden Retriever");
		Dog dog2=new Dog("Pinky","Beagle");
		dog1.display();
		dog2.display();
		
		dog1.setName("Rocky");
		dog1.setBreed("Bull Dog");
		
		dog2.setName("Rose");
		dog2.setBreed("Lavendor");
		
		dog1.display();
		dog2.display();
	}

}
