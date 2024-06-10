//package test;
//
//import java.util.Scanner;
//
//public class work4_1 {
//	public static void main(String[]args) {
//		Game game = new Game();
//		
//		game.start();
//	}
//}
//
//class Player{
//	private String name;
//	private int hand;
//	
//	public Player(String name) {
//		this.name = name;
//	}
//	
//	public void chooseHand() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("あなたの手を選んでください");
//		System.out.println("0:グー");
//		System.out.print("1:チョキ");
//		System.out.print("2:パー");
//		
//		while(!scanner.hasNextInt()) {
//			System.out.println("正しい値が入力されませんでした。システムを終了します。");
//			System.exit(0);
//		}
//		
//		int coice = scanner.nextInt();
//		if(choice < 0 || choice > 2) {
//			System.out.println("正しい値が入力されませんでした。システムを終了します。");
//			System.exit(0);
//		}
//		hand = choice;
//	}
//}
//
//class Game{
//	private Player player;
//	public Game() {
//		player = new Player("あなた");
//	}
//	
//	public void start() {
//		System.out.println("じゃんけんを開始します。");
//		
//		while(true) {
//			player.chooseHand();
//			int computerHand = 1;
//			int playerHand = player.getHand();
//			
//			String[] hands = {"グー","チョキ","パー"};
//			System.out.println("あなた：" + hands[playerHand]);
//			System.out.println("コンピュータ：" + hands[computerHand]);
//			
//			if(playerHnad == computerHand) {
//				System.out.println("あいこです！もう一度！");
//			}else if((plyaerHand == 0 && computerHand == 1) ||
//						(playerHand == 1 && computerHand == 2) ||
//						(plyaerHand == 2 && computerHand == 0)) {
//				System.out.println("あなたの勝ちです！");
//				break;
//			}else {
//				System.out.println("あなたの負けです！");
//				break;
//			}
//		}
//	}
//}
package test;

import java.util.Scanner;

public class work4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(scanner);
        game.start();
    }
}

class Player {
    private String name;
    private int hand;

    public Player(String name) {
        this.name = name;
    }

    public void chooseHand(Scanner scanner) {
        System.out.println(name + "の手を選んでください");
        System.out.println("0 : グー");
        System.out.println("1 : チョキ");
        System.out.println("2 : パー");
        System.out.print("→ ");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("正しい値が入力されませんでした。");
                scanner.next(); // 不正な入力を捨てる
                continue;
            }
            int choice = scanner.nextInt();
            if (choice < 0 || choice > 2) {
                System.out.println("正しい値が入力されませんでした。");
                continue;
            }
            hand = choice;
            break;
        }
    }

    public int getHand() {
        return hand;
    }
}

class Game {
    private Player player;

    public Game(Scanner scanner) {
        player = new Player("あなた");
        player.chooseHand(scanner); // ScannerをPlayerクラスのメソッドに渡す
    }

    public void start() {
        System.out.println("じゃんけんを開始します。");
        while (true) {
            int computerHand = 1;
            int playerHand = player.getHand();

            String[] hands = {"グー", "チョキ", "パー"};
            System.out.println("あなた：" + hands[playerHand]);
            System.out.println("コンピュータ：" + hands[computerHand]);

            if (playerHand == computerHand) {
                System.out.println("あいこです！もう一度！");
                player.chooseHand(new Scanner(System.in)); // あいこの場合、手を再選択する
                continue;
            } else if ((playerHand == 0 && computerHand == 1) ||
                       (playerHand == 1 && computerHand == 2) ||
                       (playerHand == 2 && computerHand == 0)) {
                System.out.println("あなたの勝ちです！");
                break;
            } else {
                System.out.println("あなたの負けです！");
                break;
            }
        }
    }
}






