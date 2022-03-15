package Week1;

import java.util.Scanner;

public class bj2475_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int arr [] = new int [5];
		for (int i = 0; 5 > i; i++) {
			arr[i] = in.nextInt();
		}
		
		int result = 0;
		
		for (int i = 0; 5 > i; i++) {
			result += arr[i] * arr[i];
		}
		
		System.out.println(result % 10);
	}
		
}