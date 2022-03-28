import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int L = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		//방학일에서 최대 일수를 뺸다.
        //반올림
        System.out.println(L - Math.max(A%C == 0 ? A / C : A / C + 1, (B%D == 0 ? B / D : B / D + 1)));
        in.close();
	}
}