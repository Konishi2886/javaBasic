package test;

public class Quest3_2 {
	public static void main(String[]args) {
		Cat myCat = new Cat();
		Dog1 myDog = new Dog1();
		
		myCat.Name = "たま";
		myCat.Age = 8;
		myCat.ShowProfile();
		
		myDog.Name = "マックス";
		myDog.Age = 10;
		myDog.ShowProfile();
		
		myCat.Sleep();
		myDog.Run();
	}
}
