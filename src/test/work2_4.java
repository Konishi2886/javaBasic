package test;

public class work2_4 {
	public static void main(String[] args) {
//		Dog4クラスのインスタンスを作成
		Dog4 myDog = new Dog4("柴犬");
//		SetNameメソッドで名前を設定する
		myDog.SetName("ポチ");
//		SetAgeメソッドで年齢を設定する
		myDog.SetAge(5);
//		ShowProfileメソッドで名前を表示する
		myDog.ShowProfile();

		
		getSecondDog();
	}
	public static void getSecondDog() {
		Dog4 myDog1 = new Dog4("ジャックラッセルテリア");
		myDog1.SetName("マックス");
		myDog1.SetAge(10);
		myDog1.ShowProfile();
	}

}

class Dog4{
	private String Name;
	private int Age;
	private String Breed;
	
	public Dog4(String breed) {
		Breed = breed;
	}
	public void SetName(String nm) {
		Name = nm;
	}
	public void SetAge(int age) {
		Age = age;
	}
	public void ShowProfile() {
		System.out.println("犬種は" + Breed + "、名前は" + Name + "、年齢は" + Age + "歳です。");
	}

}

