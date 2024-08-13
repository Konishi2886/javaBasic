package test;

public class TypDog {
	private String Name;
	private int Age;
	private String Breed;
	
	public TypDog(String br) {
		Breed = br;
	}
	public void SetName(String nm) {
		Name = nm;
	}
	public void SetAge(int age) {
		Age = age;
	}
	public void ShowProfile() {
		System.out.println(Breed + "の" + Name + "、年齢は" + Age +"歳です");
	}
}
