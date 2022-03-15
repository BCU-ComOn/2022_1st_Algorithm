//목표 : R2의 값을 찾아 출력
import java.util.Scanner;
public class bj3046_lsj {
	//R1과 S 값을 입력받는 입력부
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] result= {input.nextInt(),input.nextInt()};
		input.close();
		return result;
	}
	//R2의 값을 찾는 함수
	public static int find_R2(int[] val) {
		// S*2-R1= R2 
		int result=val[1]*2-val[0];
		return result;
	}
	//입력받은 값에 대한 조건 확인
	public static boolean validation_check(int[] val) {
		int a=val[0];
		int b=val[1];
		if((a>1000||a<-1000)||(b>1000||b<-1000)) {
			return false;
		}
		return true;
	}
	
	// Main 실행부
	public static void main(String[] args) {
		// 값을 입력받아 배열에 저장
		int[] input_val=input();
		// 입력받은 값이 유효한지 확인 후 R2를 찾아 출력
		if(validation_check(input_val)) {
			int result=find_R2(input_val);
			System.out.println(result);
		}
	}
}