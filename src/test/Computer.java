package test;

public class Computer {
	String comHand;
	
	public Computer() {
	}
	
	public int Action() {
		int ran = new java.util.Random().nextInt(3);
		return ran;
	}
	
	public String Hand(int handNum) {
		String[] hand = { "グー", "チョキ", "パー" };	
		switch (handNum){
			case 0:
				comHand = hand[0];
				break;
			case 1:
				comHand = hand[1];
				break;
			case 2:
				comHand = hand[2];
				break;
		}
		return comHand;
	}


}