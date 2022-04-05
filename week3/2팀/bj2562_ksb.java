package week3;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// 최댓값 2562
		Scanner in = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);

	}

}
