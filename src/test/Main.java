package test;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Computer com = new Computer();
		User user = new User();

		startComment();

		boolean isSame = false;

		do {

			int num = user.Action();
			int ran = com.Action();

			System.out.println("あなた：" + user.Hand(num) + " コンピューター：" + com.Hand(ran));

			isSame = battle(num, ran);

		} while (isSame);
	}

	public static void startComment() {
		System.out.println("じゃんけんを開始します。");
		System.out.println("あなたの手を選んでください。 ");
		System.out.println("0:グー");
		System.out.println("1:チョキ");
		System.out.println("2:パー");
		System.out.println("最初はグー、じゃんけん");
		System.out.println("ポン！");
	}

	public static boolean battle(int userHand, int comHand) {

		if (userHand == comHand) {
			System.out.println("惜しい！あいこです！じゃんけんを続けます。");
			return true;

		} else if (userHand - comHand == -1 || userHand - comHand == 2) {
			System.out.println("あなたの勝ちです！おめでとうございます！");

		} else if (userHand - comHand == 1 || userHand - comHand == -2) {
			System.out.println("残念！あなたの負けです！じゃんけんを終了します。");
		}
		return false;
	}

}
