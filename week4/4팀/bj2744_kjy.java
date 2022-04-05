package Week05;

import java.util.*;

public class bj2744_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// 문자열 입력
		String str = in.next();
		
		// 문자열 길이만큼 스캔
		for (int i = 0;str.length() > i;i++) {
			// 해당 문자가 소문자인 경우
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
				// 대문자로 변환 후 출력
				System.out.print(str.toUpperCase().charAt(i));
			}
			else {
				// 대문자인 경우 소문자로 변환 후 출력
				System.out.print(str.toLowerCase().charAt(i));
			}
		}
		
	}

}
