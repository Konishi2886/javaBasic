package test;

import java.util.Scanner;
//Player2クラスとGame2クラスを使用する
public class Quest4_1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
//		Game2クラスのgameインスタンスを作成する。この時にGame2のコンストラクタが呼び出される
		Game2 game = new Game2(scanner);
//		Game2クラスのstart()メソッドを呼び出す
		game.start();
	}
}
