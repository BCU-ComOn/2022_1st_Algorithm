package Week05;

import java.util.*;

public class bj1152_kjy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		// ���ڿ� �Է� 
		String str = in.nextLine();
		
		// �ܾ��� �� �⺻�� = 1
		int cnt = 1;
		
		// ���ڿ��� ������ ���� ��ĵ
		for (int i = 0;str.length() >i ;i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}
		
		// ���ڿ��� ó���� ���� ������ ���
		if (str.charAt(0) == ' ') {
			// ó�� �κ��� �����̸鼭 �� �޺κе� ������ ���
			if (str.charAt(str.length()-1) == ' ') {
				cnt-=2;
			}
			// ó�� �κи� ������ ���
			else {
				cnt--;
			}
		}
		// �� �κи� ������ ���
		else {
			if (str.charAt(str.length()-1) == ' ') {
				cnt--;
			}
		}
		
		// �ܾ��� �� cnt ���
		System.out.println(cnt);
		
	}

}
