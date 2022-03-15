import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int n = 0;
		for (int i = 1; i <= A; i++) {
			n += i;
		}
		System.out.println(n);
	}
}