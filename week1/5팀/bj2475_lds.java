import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		
		int F = ((A*A)+(B*B)+(C*C)+(D*D)+(E*E))%10;
		
		System.out.println(F);
	}
}

// import java.util.Scanner;

// public class Main {

// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		int n = 5;
// 		int anwer = 0;
// 		for (int i = 0; i < n; i++) {
// 			int a = in.nextInt();
// 			anwer += a*a;
// 		}
		
// 		System.out.println(anwer%10);
// 	}
// }
// 이렇게 for문을 활용하는 방법도 있다.