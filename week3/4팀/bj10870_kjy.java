package week04;

import java.util.Scanner;

public class bj10870_kjy {

	public static int fab (int n) {
		
		// �迭�� ũ��
		int arr [] = new int [n+1];
		// �迭�� �ʱⰪ�� 0 ����
		arr [0] = 0; 
		if (n >= 1) {
			arr [1] = 1;
		}
		if (arr.length >= 3) {
			// ���� �� ���� ��
			for (int i = 2; n >= i; i++) {
				arr[i] = arr[i-1] + arr [i-2];
			}
		}
		// ���� �� ���� �� ����
		int sum = arr[n];
		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// ���� n �Է�
		int n = in.nextInt();
		int sum = fab (n);
		
		System.out.println(sum);

	}

}
