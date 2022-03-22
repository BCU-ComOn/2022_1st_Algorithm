
import java.util.Scanner;

// 목표 : 입력받은 대각선의 길이, 너비와 높이의 비율을 이용해 실제 넓이와 높이를 구하는 프로그램 작성
public class bj1297_lsj {
	//입력부
	public static int[] input() {
		Scanner input=new Scanner(System.in);
		int[] val= {input.nextInt(),input.nextInt(),input.nextInt()};
		input.close();
		return val;
	}
	//대각선의 길이를 이용해 실제 너비와 길이를 구하는 함수
	public static int[] tv_cal(int[] val) {
		int a=val[0]; //대각선의 길이
		int b=val[1]; // 너비
		int c=val[2]; // 높이

		double triangle=Math.sqrt(b*b+c*c); // 대각선의 비율을 구한다
		
		double width=(a*b)/triangle; // 실제 대각선의 길이 * 너비 비율 / 대각선의 비율 = 실제 너비
		double height=(a*c)/triangle;  // 실제 대각선의 길이 * 높이 비율 / 대각선의 비율 = 실제 높이

		int[] result= {(int)width,(int)height}; // 정수형으로 변환하며 소수점 아래를 모두 버린다.
		return result;
		
	}
	//올바른 값이 입력되었는지 확인하는 함수
	public static boolean validation_check(int[] val){
		if(val[0]<5||val[0]>1000){
			return false;
		}
		if(val[1]<1||val[1]>99){
			return false;
		}
		if(val[2]<2||val[2]>100){
			return false;
		}
		if(val[1]>=val[2]){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// 실행부
		int[] val=input();
		if(validation_check(val)) {
			int[] result=tv_cal(val);
			System.out.println(result[0]+" "+result[1]);
		}
	}
}
