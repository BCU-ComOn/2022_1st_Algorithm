package week02;

import java.util.Scanner;

public class bj19698_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int W = in.nextInt();
		int H = in.nextInt();
		int L = in.nextInt();
		int useCow = (W / L) * (H / L);
		if(useCow > N) {
			System.out.println(N);
		}else {
			System.out.println(useCow);
		}
	}
}


