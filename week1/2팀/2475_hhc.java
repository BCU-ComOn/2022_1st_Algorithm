import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);	//사용자가 직접 입력
		int result = 0;
		for (int i=0;i<5;i++) {			//
			int arg = a.nextInt();		//인트로 입력 받기
			result += (int) Math.pow(arg,2);	//거듭 제곱
		}
		System.out.println(result%10);
		a.close();
	}

}
