// 목표 : n을 입력받아 1부터 n까지 출력
import java.util.Scanner;
public class bj8393_lsj {
	//값을 입력받는 부분
	public static int user_input() {
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		input.close();
		return value;
	}
	//입력받은 값의 조건 확인
	public static boolean check(int value) {
		if (value>=1 || value<=10000) {
			return true;
		}
		return false;
	}
	//1부터 n까지 더한 값을 반환하는 함수
	public static int sum(int value) {
		int summary=0;
		for(int count=0;count<=value;count++) {
			summary+=count;
		}
		return summary;
	}
	
	// Main 실행부
	public static void main(String[] args) {
		//목표값을 입력받는 부분
		int input_value=user_input();
		//입력값이 유효한지 확인 후 결과를 구해 출력
		if(check(input_value)) {
			System.out.println(sum(input_value));
		}
	}

}