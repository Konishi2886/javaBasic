package test;

public class work1_1 {
	public static void main(String[]args) {
		for(int month = 1;month <= 14;month++) {
		String  day ="";
		
		
			if(month>12) {
				day = "入力が間違っています";
				System.out.println(month + "月は" + day);
			}
			
			else {
				switch(month) {
				case 1 -> day = "31";
				case 2 -> day = "28";
				case 3 -> day = "31";
				case 4 -> day = "30";
				case 5 -> day = "31";
				case 6 -> day = "30";
				case 7 -> day = "31";
				case 8 -> day = "31";
				case 9 -> day = "30";
				case 10 -> day = "31";
				case 11 -> day = "30";
				case 12 -> day = "31";
				default -> day = "入力が間違っています";
				}
				System.out.println(month + "月は" + day + "日です");
				
			}
		

		}
	}
}
