package Week02;

import java.util.Scanner;
import java.math.BigInteger;

public class bj1712_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int L = in.nextInt(); // L = �����ϼ�
		int A = in.nextInt(); // A = ����
		int B = in.nextInt(); // B = ����
		int C = in.nextInt(); // C = �Ϸ� �ִ� ����
		int D = in.nextInt(); // D = �Ϸ� �ִ� ����
		int date = 0;
		for (int day = L ; 0 < day ; day--) {
			if (A <= 0 && B <= 0) {
				date = day;
				break;
			}
			else {
				A -= C;
				B -= D;
			}
		}
		System.out.println(date);
	}
}
