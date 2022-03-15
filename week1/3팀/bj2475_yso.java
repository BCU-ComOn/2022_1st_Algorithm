import java.util.Scanner;
public class weeK1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			sum+= n * n;
		}
		System.out.println(sum%10);
}
}