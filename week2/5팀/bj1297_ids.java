import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int D = in.nextInt();
		int H = in.nextInt();
		int W = in.nextInt();
		
		double result = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		System.out.println((int)Math.sqrt(result * Math.pow(H, 2)) + " " + (int)Math.sqrt(result * Math.pow(W, 2)));
	}
}