package Week05;

import java.util.*;

public class bj2309_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// 크기가 9인 배열 생성
		int arr [] = new int [9];
		// 합이 100 인 경우 저장할 크기가 7인 배열 생성 
		int arr2 [] = new int [7];
		// 9가지의 값을 arr배열에 전부 저장
		for (int i = 0; arr.length > i; i++) {
			arr[i] = in.nextInt();
		}
	
		
		// 9가지 수중 7 가지 수의 합이 100 이므로 경우의 수는
		// 9C7 == 9C2
		// 즉 랜덤으로 2개를 선택하는 알고리즘 생성
		// 2중 for문 까지는 전체 수를 스캔
		Loop:
		for (int i = 0; arr.length > i; i++) {
			for (int j = 0; arr.length > j; j++) {
				// 첫 번째 for 문과 두 번째 for문의 지정된 수가 겹치는 경우 break
				if (i == j) {
					break;
				}
				// 총합 sum 선언
				int sum = 0;
				// 9 가지 중 2가지를 제외한 수의 합을 구하는 반복문 
				for (int k = 0; arr.length > k; k++) {
					if (k != i && k != j) {
						sum += arr[k];
					}
				}
				// 합이 100 인 경우 arr배열에서 해당되는 수를 arr2에 저장
				if (sum == 100) {
					int l = 0;
					for (int k = 0;arr.length > k;k++) {
						if (k != i && k != j) {
							arr2[l] = arr[k];
							l++;
						}
					}
				}
			}
		}
		// 정렬
		Arrays.sort(arr2);
		// 출력
		for (int i = 0;arr2.length > i;i++) {
			System.out.println(arr2[i]);
			
		}
	}
}
