//package test;
//
//public class work2_1 {
//	public static void main(String[] args) {
////		Dogクラスのインスタンスを作成
//		Dog myDog = new Dog();
////		SetNameメソッドで名前を設定する
//		myDog.SetName("ポチ");
////		ShowProfileメソッドで名前を表示する
//		myDog.ShowProfile();
//	}
//
//}
//
//class Dog{
//	private String Name;
//	public void SetName(String nm) {
//		Name = nm;
//	}
//	public void ShowProfile() {
//		System.out.println("名前は" + Name +"です。");
//	}
//}


package test;

public class work2_1 {
	private String Name;
	public static void main(String[]args) {
		work2_1 myDog = new work2_1();
		
		myDog.SetName("ポチ");
		myDog.ShowProfile();
	}
	public void SetName(String nm)
	{
		Name = nm;
	}
	public void ShowProfile()
	{
		System.out.println("名前は" + Name +"です。");
	}



}

//package test;
//
//public class work2_1 {
//    private String Name;
//    
//    public void SetName(String nm) {
//        Name = nm;
//    }
//    
//    public void ShowProfile() {
//        System.out.println("名前は" + Name + "です。");
//    }
//
//    public static void main(String[] args) {
//        work2_1 myDog = new work2_1();
//        myDog.SetName("ポチ");
//        myDog.ShowProfile();
//    }
//}
