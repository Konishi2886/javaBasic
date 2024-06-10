package test;

public class work2_3 {
	public static void main(String[] args) {
//		Dog3クラスのインスタンスを作成
		Dog3 myDog = new Dog3();
//		SetNameメソッドで名前を設定する
		myDog.SetName("ポチ");
//		SetAgeメソッドで年齢を設定する
		myDog.SetAge(5);
//		ShowProfileメソッドで名前を表示する
		myDog.ShowProfile();
		
		getSecondDog();
	}
	public static void getSecondDog() {
		Dog3 myDog1 = new Dog3();
		myDog1.SetName("マックス");
		myDog1.SetAge(10);
		myDog1.ShowProfile();
	}

}

class Dog3{
	private String Name;
	private int Age;
	public void SetName(String nm) {
		Name = nm;
	}
	public void SetAge(int age) {
		Age = age;
	}
	public void ShowProfile() {
		System.out.println("名前は" + Name + "、年齢は" + Age + "歳です。");
	}
}
