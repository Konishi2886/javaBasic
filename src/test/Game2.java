package test;

import java.util.Scanner;

public class Game2 {
	private Player2 player;
	
//	Game2のコンストラクタ
	public Game2(Scanner scanner) {
//		Player2クラスのインスタンスplayerを作成する。この時にPlayer2クラスのコンストラクタが呼び出される
//		nameという引数がおまえという文字列で初期化される
		player = new Player2("おまえ");
//		Player2クラスのchooseHandメソッドを呼び出す
		player.chooseHand(scanner);
	}
	
	public void start() {
		System.out.println("じゃんけんを開始する");
//		プレイヤーが勝つか負けるまでる無限ループする
		while(true) {
//			コンピュータの手を1に設定する
			int computerHand = 1;
//			プレイヤーの手をPlayerクラスのgetHandメソッドを呼び出して決める
			int playerHand = player.getHand();
			
//			表示する手の配列を作成する
			String[] hands = {"グー","チョキ","パー"};
//			プレイヤーの選択した手を配列の文字列で表示
			System.out.println("おまえ:" + hands[playerHand]);
//			コンピュータの手を配列の文字列で表示
			System.out.println("コンピュータ:" + hands[computerHand]);
			
//			プレイヤーとコンピュータの手が同じとき
			if(playerHand == computerHand) {
				System.out.println("あいこだ。もう一度！");
//				chooseHandメソッドを呼び出し、新しいScannerオブジェクトを渡す
				player.chooseHand(new Scanner(System.in));
				continue;
			}
//			プレイヤーが勝ちの時
			else if((playerHand == 0 && computerHand == 1) ||
					(playerHand == 1 && computerHand == 2) ||
					(playerHand == 2 && computerHand == 0)) {
				System.out.println("おまえの勝ちだ！");
				break;
			}
//			負けの時
			else {
				System.out.println("おまえの負けだ");
				break;
			}
		}
	}
}

