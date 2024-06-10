package test;
import java.util.Scanner;

public class work2_6 {
    public static void main(String[] args) {
        CoinCase1 myCase = new CoinCase1();
        Scanner scanner = new Scanner(System.in);
        
        // 硬貨を10回追加する
        for (int i = 0; i < 10; i++) {
            System.out.println("硬貨の種類を入力してください(500,100,50,10,5,1)：");
            int coinType = scanner.nextInt();
            System.out.println("枚数を入力してください：");
            int count = scanner.nextInt();
            myCase.AddCoins(coinType, count);
        }
        
        scanner.close();
        
        // 各硬貨の枚数を表示
        System.out.println("500円の枚数: " + myCase.GetCount(500));
        System.out.println("100円の枚数: " + myCase.GetCount(100));
        System.out.println("50円の枚数: " + myCase.GetCount(50));
        System.out.println("10円の枚数: " + myCase.GetCount(10));
        System.out.println("5円の枚数: " + myCase.GetCount(5));
        System.out.println("1円の枚数: " + myCase.GetCount(1));
        
        // 硬貨の総額を表示
        System.out.println("硬貨の総額: " + myCase.GetAmount() + "円");
//        硬貨の総数を表示
        System.out.println("硬貨の総数：" + myCase.GetCount() + "枚");
//        各硬貨の総額
        System.out.println("500円の総額: " + 500 * myCase.GetCount(500));
        System.out.println("100円の総額: " + 500 * myCase.GetCount(100));
        System.out.println("50円の総額: " + 500 * myCase.GetCount(50));
        System.out.println("10円の総額: " + 500 * myCase.GetCount(10));
        System.out.println("5円の総額: " + 500 * myCase.GetCount(5));
        System.out.println("1円の総額: " + 500 * myCase.GetCount(1));
    }
}

class CoinCase1 {
    private int count500;
    private int count100;
    private int count50;
    private int count10;
    private int count5;
    private int count1;
    
    public void AddCoins(int coinType, int count) {
        switch (coinType) {
            case 500 -> count500 += count;
            case 100 -> count100 += count;
            case 50 -> count50 += count;
            case 10 -> count10 += count;
            case 5 -> count5 += count;
            case 1 -> count1 += count;
            default -> System.out.println("無効な硬貨の種類です。");
        }
    }
    
    public int GetCount(int coinType) {
        return switch (coinType) {
            case 500 -> count500;
            case 100 -> count100;
            case 50 -> count50;
            case 10 -> count10;
            case 5 -> count5;
            case 1 -> count1;
            default -> -1;
        };
    }
    
    public int GetAmount() {
        return (500 * count500) + (100 * count100) + (50 * count50) + (10 * count10) + (5 * count5) + (1 * count1);
    }
    
    public int GetCount() {
    	return (count500 + count100 + count50 + count10 + count5 + count1);
    }
}
