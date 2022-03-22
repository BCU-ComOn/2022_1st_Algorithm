
import java.util.Scanner;

// 목표 : 년도를 입력받아 윤년인지 구분하는 프로그램 작성
public class bj2753_lsj {
	//입력부
	public static int input() {
		Scanner in = new Scanner(System.in);
		int input=in.nextInt();
		in.close();
		return input;
	}
	//윤년을 찾는 함수
	public static int find_yoon(int year) {
		if(year%4!=0) { //4의 배수가 아니라면 윤년이 아니다.
			return 0;
		}else if(year%100==0) { // 4의 배수이고 100으로 나누어 떨어지는가?
			if(year%400==0) { //4의 배수이고 100으로 나누어 떨어지며 400의 배수이다 == 윤년
				return 1;
			}
			return 0;// 400의 배수가 아니므로 윤년이 아니다.
		}else {
			return 1;// 그 외 = 윤년
		}
	}
	//조건 확인
	public static boolean validation_check(int y) {
		if(y>0&&y<4001) { 
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int val=input();
		if(validation_check(val)) {
			int result= find_yoon(val);
			System.out.println(result);
		}
	}
}
