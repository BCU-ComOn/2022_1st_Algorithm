import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int L,A,B,C,D; 
		L = s.nextInt(); //방학 총 일수 입력
		A = s.nextInt(); //방학 동안 풀어야 할 국어 입력
		B = s.nextInt(); // 방학 동안 풀어야 할 수학 입력
		C = s.nextInt(); // 하루 동안 풀수 있는 국어 입력
		D = s.nextInt(); // 하루 동안 풀수 있는 수학 입력
		
		if(A%C==0) {
			A = A/C; 
		} else {
			A = A/C +1;
		}
		
		if(B%D==0) {
			B = B/D;
		} else {
			B = B/D +1;
		}
		
		if(B>A) {
			System.out.println(L-B);
		}else {
			System.out.println(L-A);
		}
	}
}