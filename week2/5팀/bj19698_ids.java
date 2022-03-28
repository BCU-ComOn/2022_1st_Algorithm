import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int W = in.nextInt();
		int H = in.nextInt();
		int L = in.nextInt();
		int A = (W/L)*(H/L);
		
		if(A >= N) {
			System.out.println(N);
		} else {System.out.println(A);}
	}
}