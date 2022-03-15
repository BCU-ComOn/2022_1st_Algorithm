package week1;
//목표 : a+b의 값을 출력
// 임포트 스캐너
import java.util.Scanner;

public class bj2558_lsj {
	//입력 함수
	public static int[] user_input() {
		Scanner input= new Scanner(System.in);
		int[] value= {input.nextInt(),input.nextInt()};
		input.close();
		return value;
	}
	//계산 함수
	public static int summary(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int[] value=user_input();
		System.out.println(summary(value[0],value[1]));
	}

}
