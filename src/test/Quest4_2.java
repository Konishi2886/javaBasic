package test;

import java.util.Scanner;

public class Quest4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Game3 game = new Game3(scanner);
		game.start();
		scanner.close();
	}

}
