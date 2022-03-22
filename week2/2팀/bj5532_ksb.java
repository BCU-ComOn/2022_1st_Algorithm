package Week_2;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// 방학 숙제
		Scanner in = new Scanner(System.in);
		
		int L = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int day = 0;
		while(true) {
			A = A - C;
			B = B - D;
			day++;
			
			if(A <= 0 && B <= 0) {
				break;
			}
		}
		System.out.println(L - day);
		
	}

}