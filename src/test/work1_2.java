//package test;
//
//import java.util.Arrays;
//
//public class work1_2 {
//	public static void main(String[]args) {
//		int[] numberArray = {2,6,3,8,4,12,67,21,37};
//	
//		Arrays.sort(numberArray);
//	
//		for(int num :numberArray){
//			System.out.println(num + " ");
//		}	
//	}
//}

package test;
//InputStremReaderの読み取りを効率的にするクラス
import java.io.BufferedReader;
//入力操作中に発生する可能性のあるエラーを表す例外クラスを使用するためのインポートステートメント
import java.io.IOException;
//ユーザーからの入力を扱えるようになる
import java.io.InputStreamReader;

public class work1_2 {
	public static void main(String[]args) {
//		ユーザーからの入力を読み取るためのオブジェクトを生成する
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
//		try:例外が発生する可能性があるコードを囲むために使用
		try {
//			10個の数字を格納する配列を作成する
			int values[] = new int[10];
			System.out.println("数字を10個入力してください");
			for( int i = 0 ; i < 10 ; i++)
			{
//				配列にユーザーが入力した数字を格納する
				values[i] = Integer.parseInt(br.readLine());		
			}
//			配列のデータを比較して入れ替える
			for(int i = 0 ; i < 10 ; i++)
			{
				
				for(int j = i + 1 ; j < 10 ; j++)
				{
					if(values[i] > values[j]) {
						int t = values[i];
						values[i] = values[j];
						values[j] = t;
					} 
				}
			}
			
			for(int i = 0 ; i<10 ; i++)
			{
//				並び変えた配列を出力する
				System.out.print(values[i] + " ");
			}
		} 
		
//		文字列を数値に変換するInteger.parseInt("abc)のような操作で発生するエラーのスタックトレースを出力する
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		
//		ユーザーからの入力を読み取る際にエラーが発生した際、その詳細な情報を出力する
		catch (IOException e) {
			e.printStackTrace();
		}
//		catchの順番：特定のエラーを先に出力、処理することで、特定のエラーに対して適切な処理が行われる
	}
}