package test;

public class Quest3_4 {
	public static void main(String[]args) {
		Animal[] myPets = new Animal[4];
		
		myPets[0] = new Cat();
		myPets[1] = new Dog1();
		myPets[2] = new Cat();
		myPets[3] = new Dog1();
		
		for(Animal Pet : myPets) 
			Pet.Speak();
	}
}
