package Week05;

import java.util.*;

public class bj2309_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// ũ�Ⱑ 9�� �迭 ����
		int arr [] = new int [9];
		// ���� 100 �� ��� ������ ũ�Ⱑ 7�� �迭 ���� 
		int arr2 [] = new int [7];
		// 9������ ���� arr�迭�� ���� ����
		for (int i = 0; arr.length > i; i++) {
			arr[i] = in.nextInt();
		}
	
		
		// 9���� ���� 7 ���� ���� ���� 100 �̹Ƿ� ����� ����
		// 9C7 == 9C2
		// �� �������� 2���� �����ϴ� �˰��� ����
		// 2�� for�� ������ ��ü ���� ��ĵ
		Loop:
		for (int i = 0; arr.length > i; i++) {
			for (int j = 0; arr.length > j; j++) {
				// ù ��° for ���� �� ��° for���� ������ ���� ��ġ�� ��� break
				if (i == j) {
					break;
				}
				// ���� sum ����
				int sum = 0;
				// 9 ���� �� 2������ ������ ���� ���� ���ϴ� �ݺ��� 
				for (int k = 0; arr.length > k; k++) {
					if (k != i && k != j) {
						sum += arr[k];
					}
				}
				// ���� 100 �� ��� arr�迭���� �ش�Ǵ� ���� arr2�� ����
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
		// ����
		Arrays.sort(arr2);
		// ���
		for (int i = 0;arr2.length > i;i++) {
			System.out.println(arr2[i]);
			
		}
	}
}
