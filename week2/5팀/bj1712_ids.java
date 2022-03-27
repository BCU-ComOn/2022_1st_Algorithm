import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if(C-B <= 0) {
			System.out.println("-1");
		}else {
			System.out.println(A/(C-B)+1);
		}
	}
}

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		int B = in.nextInt();
//		int C = in.nextInt();
//		int pro = A/(C-B)+1;
//		
//		if(C-B <= 0) {
//			System.out.println("-1");
//		}else {
//			System.out.println(pro);
//		}
//	}
//}
// 변수의 추가는 시간제한을 넘을 수 있다.