import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //소들의 수
		int W = in.nextInt(); //헛간 가로
		int H = in.nextInt(); //헛간 세로
		int L = in.nextInt(); //소들에게 배정되는 공강의 길이
		int cow = (W / L) * (H / L);
		
		if(cow >= N) {
			System.out.println(N);
		}else {
			System.out.println(cow);
		}
	}

}
