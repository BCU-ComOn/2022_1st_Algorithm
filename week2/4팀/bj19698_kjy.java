package Week02;

import java.util.Scanner;

public class bj19698_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// �Է�
		int N = in.nextInt(); 	// �ҵ��� ��
		int W = in.nextInt(); 	// �갣�� ��
		int H = in.nextInt(); 	// �갣�� ����
		int L = in.nextInt(); 	// �����Ǵ� ����
		int cnt = 0;		 	// ���ְ����� �ҵ��� �� ī��Ʈ 
		
		// ���
		Loop1 :
		for (int i = 1 ; W >= L * i ; i++) {
			for (int j = 1 ;H >= L * j ; j++) {
				cnt++; 
				N--;
				// ���� N = 0, ��� �Ұ� �����Ѱ�� Loop1���� �ݺ��� break
				if (N == 0) {
					break Loop1;
				}
			}
		}
		
		// ���
		System.out.println(cnt);
	}
}
