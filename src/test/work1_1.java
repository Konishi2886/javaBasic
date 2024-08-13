//package test;
//
//public class work1_1 {
//	public static void main(String[]args) {
//		for(int month = 1;month <= 14;month++) {
//		String  day ="";
//		
//		
//			if(month>12) {
//				day = "入力が間違っています";
//				System.out.println(month + "月は" + day);
//			}
//			
//			else {
//				switch(month) {
//				case 1 -> day = "31";
//				case 2 -> day = "28";
//				case 3 -> day = "31";
//				case 4 -> day = "30";
//				case 5 -> day = "31";
//				case 6 -> day = "30";
//				case 7 -> day = "31";
//				case 8 -> day = "31";
//				case 9 -> day = "30";
//				case 10 -> day = "31";
//				case 11 -> day = "30";
//				case 12 -> day = "31";
//				default -> day = "入力が間違っています";
//				}
//				System.out.println(month + "月は" + day + "日です");
//				
//			}
//		
//
//		}
//	}
//}

package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class work1_1{
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("何月ですか？");
		int month;
		try {
			month = Integer.parseInt(br.readLine());
			
			switch(month) {
			case 2:
				System.out.println("28日です");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30日です");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31日です");
				break;
			default:
				System.out.println("入力が間違っています");
				break;
			}
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}