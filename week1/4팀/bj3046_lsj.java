package week1;

import java.util.Scanner;
public class bj3046_lsj {
	//값을 입력받는 부분
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] result= {input.nextInt(),input.nextInt()};
		return result;
	}
	//R2값을 찾는 함수
	public static int find_R2(int[] val) {
		//평균X2-R1 = R2를 이용한 결과
		int result=val[1]*2-val[0];
		return result;
	}
	//입력된 값이 올바른지 확인하는 함수
	public static boolean validation_check(int[] val) {
		int a=val[0];
		int b=val[1];
		//조건 확인
		if((a>1000||a<-1000)||(b>1000||b<-1000)) {
			return false;
		}
		return true;
	}
	
	//실행부
	public static void main(String[] args) {
		// 값 입력
		int[] input_val=input();
		// 조건 확인 후 R2를 찾아 출력
		if(validation_check(input_val)) {
			int result=find_R2(input_val);
			System.out.println(result);
		}
	}
}