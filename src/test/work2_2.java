package test;

public class work2_2 {
	public static void main(String[] args) {
//		Dog2クラスのインスタンスを作成
		Dog2 myDog = new Dog2();
//		SetNameメソッドで名前を設定する
		myDog.SetName("ポチ");
//		SetAgeメソッドで年齢を設定する
		myDog.SetAge(5);
//		ShowProfileメソッドで名前を表示する
		myDog.ShowProfile();
	}

}

class Dog2{
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