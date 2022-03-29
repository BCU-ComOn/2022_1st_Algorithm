package week04;

import java.util.*;

public class bj2563_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// 배열의 크기
		int arrayNum = 9;		
		int array [] = new int [arrayNum];
		int max = 0;
		int maxNum = 0;
		
		// 배열에 입력
		for (int i = 0; arrayNum > i; i++) {
			array[i] = in.nextInt();
		}
		
		// 최대값과 몇 번째 수인지 출력
		for (int i = 0; arrayNum > i; i++) {
			if (array[i] >= max) {
				max = array[i];
				maxNum = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(maxNum);
		
	}

}
