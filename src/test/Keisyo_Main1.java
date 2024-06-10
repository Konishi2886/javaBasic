package test;

public class Keisyo_Main1 {
	
	public static void main(String[]args) {
		//Keisyo_Konishi1クラスのオブジェクトを作る
		Keisyo_Konishi1 konishi = new Keisyo_Konishi1();
		
		//体重を設定する
		konishi.weight = 60;
		//慎重を設定する
		konishi.height = 1.75;
		
		//BMIを計算する
		double bmi = konishi.calcBmi(konishi.weight,konishi.height);
		//BMIを出力する
		System.out.println("BMIは"+bmi);
	}

}
