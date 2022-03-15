package Week1;

import java.util.Scanner;

public class bj3046_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int R1 = in.nextInt();
		int S = in.nextInt();
		if (R1 > S) {
			System.out.println(R1 - 2 * (R1 - S));
		}
		else {
			System.out.println(2 * (S - R1) + R1);
		}
	}
		
}