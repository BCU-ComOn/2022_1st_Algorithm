import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A[] = new int[9];
		int M = A[0];
		int I = 0;
		
		for(int i = 0; i < A.length; i++) {
			A[i] = in.nextInt();
			if(M < A[i]) {
				M = A[i];
				I = i + 1;
			}
		}
		System.out.println(M + " " + I);
	}
}