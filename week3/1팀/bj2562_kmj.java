package week03;

import java.util.Arrays;
import java.util.Scanner;

public class bj2562_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
			if(max < num[i]) {
				max = num[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
