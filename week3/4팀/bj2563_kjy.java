package week04;

import java.util.*;

public class bj2563_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		// �迭�� ũ��
		int arrayNum = 9;		
		int array [] = new int [arrayNum];
		int max = 0;
		int maxNum = 0;
		
		// �迭�� �Է�
		for (int i = 0; arrayNum > i; i++) {
			array[i] = in.nextInt();
		}
		
		// �ִ밪�� �� ��° ������ ���
		for (int i = 0; arrayNum > i; i++) {
			if (array[i] >= max) {
				max = array[i];
				maxNum = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(maxNum);
		
	}

}
