package test;

import java.util.Scanner;

public class Player2 {
	private String name;
	private int hand;
	
//	Player2のコンストラクタ
	public Player2(String name) {
		this.name = name;
	}
	

	public void chooseHand(Scanner scanner) {
		System.out.println(name + "の手を選べ");
		System.out.println("0:グー");
		System.out.println("1:チョキ");
		System.out.println("2:パー");
		System.out.println("→");
		
//		正しい値が入力されるまで無限ループする
		while(true) {
//			入力値が整数でない場合にtrueになる
			if(!scanner.hasNextInt()) {
				System.out.println("正しい値が入力されていない。");
				System.out.println(name + "の手を選べ");
				scanner.next();
				continue;
			}
//			入力された整数値をchoiseに格納する
			int choise = scanner.nextInt();
			
//			choiseが0～2の間にあるかチェックする
			if(choise < 0 || 2 < choise) {
				System.out.println("正しい値が入力されていない。");
				System.out.println(name + "の手を選べ");
				System.out.println("→");
				continue;
			}
//			条件を満たしたとき、choiseをhandに格納してループを終了する
			hand = choise;
			break;
		
			}
		}
	
	public int getHand() {
//		0～2の整数値handを返す
		return hand;
	}
}
