package Week05;

import java.util.*;

public class bj2675_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// 시행횟수 testcase 
		int testcase = in.nextInt();

		// testcase 만큼 반복
		for (int i = 0; testcase > i ; i++) {
			// n == 반복 횟수
			int n = in.nextInt();
			String str = in.next();
			
			// str의 길이만큼 스캔
			for (int j = 0;str.length() > j;j++) {
				// n 만큼 반복
				for (int k = 0; n > k ;k++) {
					// 출력
					System.out.print(str.charAt(j));
				}
			}
			// 다음줄
			System.out.println();
		}
		
	}

}
