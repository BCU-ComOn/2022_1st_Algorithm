package Week05;

import java.util.*;

public class bj2675_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// ����Ƚ�� testcase 
		int testcase = in.nextInt();

		// testcase ��ŭ �ݺ�
		for (int i = 0; testcase > i ; i++) {
			// n == �ݺ� Ƚ��
			int n = in.nextInt();
			String str = in.next();
			
			// str�� ���̸�ŭ ��ĵ
			for (int j = 0;str.length() > j;j++) {
				// n ��ŭ �ݺ�
				for (int k = 0; n > k ;k++) {
					// ���
					System.out.print(str.charAt(j));
				}
			}
			// ������
			System.out.println();
		}
		
	}

}
