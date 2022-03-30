package week04;

import java.util.*;

public class bj2798_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int cards = in.nextInt();
		int limit = in.nextInt();
		
		int arr [] = new int [cards];
		
		// 카드 입력
		for (int i = 0; cards > i ; i++) {
			arr [i] = in.nextInt();
		}
		
		// 입력받은 카드 정렬
		Arrays.sort(arr);
		
		// 3개의 카드를 조합하는 경우의 수
		int arrayLen = 0;
		
		// 최대값 변수 선언
		int max = 0;
		// 같은 카드가 겹치지 않고 나오는 경우의 수
		for (int i = 0; cards > i ; i++) {
			Loop1 :
			for (int j = 0; cards > j ; j++) {
				if (j == i) {
					// 만약 i 와 j번째 카드가 같다면 Loop1으로 복귀
					break Loop1;
				}
				else {
					Loop2 :
					for (int k = 0; cards > k ; k++) {
						// k 와 j 번째 혹은 k 와 i 번째 카드가 같다면 Loop2로 복귀
						if(k == j || k == i) {
							break Loop2;
						}
						// 조건에 만족하는 최대값 계산
						else {
							if (limit >= arr[i] + arr[j] + arr[k] && max <= arr[i] + arr[j] + arr[k]) {
								max = arr[i] + arr[j] + arr[k];
							}
						}
					}
				}
			}
		}
		
		System.out.println(max);
		// nonerror
	}

}
