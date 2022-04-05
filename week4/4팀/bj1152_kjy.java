package Week05;

import java.util.*;

public class bj1152_kjy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		// 문자열 입력 
		String str = in.nextLine();
		
		// 단어의 수 기본값 = 1
		int cnt = 1;
		
		// 문자열중 공백인 문자 스캔
		for (int i = 0;str.length() >i ;i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}
		
		// 문자열중 처음부 분이 공백인 경우
		if (str.charAt(0) == ' ') {
			// 처음 부분이 공백이면서 맨 뒷부분도 공백인 경우
			if (str.charAt(str.length()-1) == ' ') {
				cnt-=2;
			}
			// 처음 부분만 공백인 경우
			else {
				cnt--;
			}
		}
		// 뒷 부분만 공백인 경우
		else {
			if (str.charAt(str.length()-1) == ' ') {
				cnt--;
			}
		}
		
		// 단어의 수 cnt 출력
		System.out.println(cnt);
		
	}

}
