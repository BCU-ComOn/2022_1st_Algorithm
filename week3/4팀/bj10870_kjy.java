package week04;

import java.util.Scanner;

public class bj10870_kjy {

	public static int fab (int n) {
		
		// 배열의 크기
		int arr [] = new int [n+1];
		// 배열의 초기값은 0 고정
		arr [0] = 0; 
		if (n >= 1) {
			arr [1] = 1;
		}
		if (arr.length >= 3) {
			// 앞의 두 수의 합
			for (int i = 2; n >= i; i++) {
				arr[i] = arr[i-1] + arr [i-2];
			}
		}
		// 앞의 두 수의 합 리턴
		int sum = arr[n];
		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// 정수 n 입력
		int n = in.nextInt();
		int sum = fab (n);
		
		System.out.println(sum);

	}

}
