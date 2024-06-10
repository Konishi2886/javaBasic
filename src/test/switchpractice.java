package test;

public class switchpractice {
	public static void main(String[] args) {
		int age = 30;
		String fee = "";

		fee = switch (age) {
		case 10 -> "1000";
		case 20 -> "2000";
		case 30,40 -> "3000";
		case 50 -> "5000";
		default -> "500";
		};

		System.out.println(age + "代の料金は" + fee + "円");
	}
}