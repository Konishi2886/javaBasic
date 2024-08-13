package test;

import java.util.Scanner;

public class Player3 {
	private String name;
	private int hand;
	
	public Player3(String name) {
		this.name = name;
	}
	
	public void chooseHand(Scanner scanner) {
        System.out.println(name + "の手を選んでください");
        System.out.println("0 : グー");
        System.out.println("1 : チョキ");
        System.out.println("2 : パー");
        System.out.print("→ ");
        
        while(true) {
        	if(!scanner.hasNextInt()) {
        		System.out.println("正しい値が入力されませんでした");
        		System.out.println(name + "の手を選んでください");
        		System.out.print("→ ");
        		scanner.next();
        		continue;
        	}
        	int choise = scanner.nextInt();
        	if(choise < 0 || 2 < choise) {
        		System.out.println("正しい値が入力されませんでした");
        		System.out.println(name + "の手を選んでください");
        		System.out.print("→ ");
        		continue;
        	}
        	hand = choise;
        	break;
        }
        	
	}
	public int getHand() {
		return hand;
	}
}
