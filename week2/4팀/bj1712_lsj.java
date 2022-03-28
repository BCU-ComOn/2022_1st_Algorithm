
import java.util.Scanner;

// 목표 : 고정지출 A와 제조비 B, 판매비 C를 입력받아 손익분기점을 구하는 프로그램을 작성
public class bj1712_lsj {
	// 조건 - 21억 이하의 정수 : int 자료형을 사용하라는 것을 의미
	// 입력부
	public static int[] user_in() {
		Scanner input = new Scanner(System.in);
		int[] val= {input.nextInt(), input.nextInt(), input.nextInt()};
		input.close();
		return val;
	}
	// 손익분기점을 구하는 함수
	public static int seek_break_even_point(int[] val){
		int minus_val=-val[0]; //마이너스값 (고정 지출)
		int product_sell_benefit=val[2]-val[1]; //제품 하나당 발생하는 이익 (판매가 - 생산가 = 이익)
		if(product_sell_benefit<1) { //이익이 발생할 수 없는 경우
			return -1;
		}
		for(int count=1;;count++) { //물건이 판매되며 이익이 되는 구간을 찾는다
			minus_val+=product_sell_benefit;
			if(minus_val>0) { //손익분기점 달성 시 판매된 물건의 개수 반환
				return count;
			}
		}
	}
	public static void main(String[] args) {
		// 실행부
		int[] val=user_in();
		int result=seek_break_even_point(val);
		System.out.println(result);
	}
}
