//목표 : A+B 값 출력
import java.util.Scanner;

public class bj2558_lsj {
	// 입력부
	public static int[] user_input() {
		Scanner input= new Scanner(System.in);
		int[] value= {input.nextInt(),input.nextInt()};
		input.close();
		return value;
	}
	//A+B 연산부
	public static int summary(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int[] value=user_input();
		System.out.println(summary(value[0],value[1]));
	}

}
