package Week02;

import java.util.Scanner;
import java.math.BigInteger;

public class bj1712_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int L = in.nextInt(); // L = 방학일수
		int A = in.nextInt(); // A = 국어
		int B = in.nextInt(); // B = 수학
		int C = in.nextInt(); // C = 하루 최대 국어
		int D = in.nextInt(); // D = 하루 최대 수학
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
