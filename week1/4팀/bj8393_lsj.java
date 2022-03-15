package week1;

import java.util.Scanner;
public class bj8393_lsj {
	//값을 입력받는 함수
	public static int user_input() {
		Scanner input=new Scanner(System.in);
		return input.nextInt();
	}
	//입력된 값이 올바른지 확인하는 함수
	public static boolean check(int value) {
		if (value>=1 || value<=10000) {
			return true;
		}
		return false;
	}
	//1부터 n까지의 합을 구해 반환하는 함수
	public static int sum(int value) {
		int summary=0;
		for(int count=0;count<=value;count++) {
			summary+=count;
		}
		return summary;
	}
	
	//실행부 Main
	public static void main(String[] args) {
		//값 입력받기
		int input_value=user_input();
		//값이 올바른지 확인 후 실행
		if(check(input_value)) {
			System.out.println(sum(input_value));
		}
	}

}