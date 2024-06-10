package test;

import java.util.Arrays;

public class work1_2 {
	public static void main(String[]args) {
		int[] numberArray = {2,6,3,8,4,12,67,21,37};
	
		Arrays.sort(numberArray);
	
		for(int num :numberArray){
			System.out.println(num + " ");
		}	
	}
}
