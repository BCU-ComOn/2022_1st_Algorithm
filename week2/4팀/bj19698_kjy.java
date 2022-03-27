package Week02;

import java.util.Scanner;

public class bj19698_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// 입력
		int N = in.nextInt(); 	// 소들의 수
		int W = in.nextInt(); 	// 헛간의 폭
		int H = in.nextInt(); 	// 헛간의 높이
		int L = in.nextInt(); 	// 배정되는 공간
		int cnt = 0;		 	// 입주가능한 소들의 수 카운트 
		
		// 계산
		Loop1 :
		for (int i = 1 ; W >= L * i ; i++) {
			for (int j = 1 ;H >= L * j ; j++) {
				cnt++; 
				N--;
				// 만약 N = 0, 모든 소가 입주한경우 Loop1안의 반복문 break
				if (N == 0) {
					break Loop1;
				}
			}
		}
		
		// 출력
		System.out.println(cnt);
	}
}
