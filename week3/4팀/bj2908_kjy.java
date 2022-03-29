package week04;

import java.util.*;

public class bj2908_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);	
		
		int arr [] = new int [2];
		for (int i = 0; 2 > i; i++) {
			arr [i] = in.nextInt();
		}
		
		int out1 = 0;
		int out2 = 0;
		
		// 입력받은 숫자를 거꾸로 보기
		for (int i = 0; 3 > i; i++) {
			out1 += (arr[0] % 10) * Math.pow(10, 2-i) ;
			out2 += (arr[1] % 10) * Math.pow(10, 2-i) ;
			arr[0] = arr[0] / 10;
			arr[1] = arr[1] / 10;
		}
		
		// 2개의 출력값중 큰 수를 출력
		System.out.println(out1 > out2 ? out1 : out2);
	}

}
