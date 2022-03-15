package week01;

import java.util.Scanner;

public class bj3046_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R1 = in.nextInt();
		int S = in.nextInt();
		int R2;
		int sum = 0;
		
		sum = 2*S - R1;
		System.out.println(sum);
	}

}
