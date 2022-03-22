package Week02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);	

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int status = 0;
		int N = 0;
		
		int BEP = C - B;
		int out = A + (B * N);
		status = out;
		while (true) {
			N++;
			if (BEP *N > out) {
				System.out.println(N);
				break;
			}
			else if (status <= (out - BEP)) {
				System.out.println("-1");
				break;
			}
		}
	}
		
}
