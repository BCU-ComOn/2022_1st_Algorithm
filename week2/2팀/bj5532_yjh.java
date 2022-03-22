package wwwe;

import java.util.Scanner;

public class bj5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		int d = num.nextInt();
		int e = num.nextInt();
		int s = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		if (b % d == 0) {
			sum1 = b/d;
		}
		else {
			sum1 = (b/d)+1;
		}
		
		if (c % e== 0) {
			sum2 = c/e;
		}
		else {
			sum2 = (c/e)+1;
		}
		s= Math.max(sum1, sum2);
		System.out.println(a-s);
	}
}