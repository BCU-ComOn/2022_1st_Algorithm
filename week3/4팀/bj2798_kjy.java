package week04;

import java.util.*;

public class bj2798_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int cards = in.nextInt();
		int limit = in.nextInt();
		
		int arr [] = new int [cards];
		
		// ī�� �Է�
		for (int i = 0; cards > i ; i++) {
			arr [i] = in.nextInt();
		}
		
		// �Է¹��� ī�� ����
		Arrays.sort(arr);
		
		// 3���� ī�带 �����ϴ� ����� ��
		int arrayLen = 0;
		
		// �ִ밪 ���� ����
		int max = 0;
		// ���� ī�尡 ��ġ�� �ʰ� ������ ����� ��
		for (int i = 0; cards > i ; i++) {
			Loop1 :
			for (int j = 0; cards > j ; j++) {
				if (j == i) {
					// ���� i �� j��° ī�尡 ���ٸ� Loop1���� ����
					break Loop1;
				}
				else {
					Loop2 :
					for (int k = 0; cards > k ; k++) {
						// k �� j ��° Ȥ�� k �� i ��° ī�尡 ���ٸ� Loop2�� ����
						if(k == j || k == i) {
							break Loop2;
						}
						// ���ǿ� �����ϴ� �ִ밪 ���
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
