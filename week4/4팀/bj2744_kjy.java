package Week05;

import java.util.*;

public class bj2744_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		// ���ڿ� �Է�
		String str = in.next();
		
		// ���ڿ� ���̸�ŭ ��ĵ
		for (int i = 0;str.length() > i;i++) {
			// �ش� ���ڰ� �ҹ����� ���
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
				// �빮�ڷ� ��ȯ �� ���
				System.out.print(str.toUpperCase().charAt(i));
			}
			else {
				// �빮���� ��� �ҹ��ڷ� ��ȯ �� ���
				System.out.print(str.toLowerCase().charAt(i));
			}
		}
		
	}

}
