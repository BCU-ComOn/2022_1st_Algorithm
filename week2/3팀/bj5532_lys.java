import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int day = 0;
		while(true) {
			a -= c;
			b -=d ;
			day++;
			if(a <= 0 && b <= 0) {
				break;
			}
		}
		System.out.println(l - day);
	}

}
