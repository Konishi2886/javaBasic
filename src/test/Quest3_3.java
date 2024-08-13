
package test;

public class Quest3_3 {
	public static void main(String[]args) {
		Cat myCat = new Cat();
		Dog1 myDog = new Dog1();
		
		myCat.Name = "たま";
		myCat.Age = 3;
		myDog.Name = "マックス";
		myDog.Age = 4;
		myCat.ShowProfile();
		myDog.ShowProfile();
		myCat.Speak();
		myDog.Speak();
	}
}
