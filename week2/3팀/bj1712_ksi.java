import java.util.Scanner;

public class BJ_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result;
		
		if(B>=C) {
			result = -1;
			System.out.println(result);
		} else {
			result = A / (C-B);
			System.out.println(result+1);
		}
	}

}