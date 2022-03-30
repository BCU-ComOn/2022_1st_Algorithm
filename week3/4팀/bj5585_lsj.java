
import java.util.Scanner;
// 목표 : 가격이 n엔인 물건 구매를 위해 1000엔을 낸 뒤 500엔, 100엔, 50엔, 10엔, 5엔, 1엔 단위로 받을 거스름돈 개수의 "최소" 
public class bj5585_lsj {
	//가격을 입력받는 함수 (정수)
	public static int cost_input() {
		Scanner input = new Scanner(System.in);
		int val=input.nextInt();
		input.close();
		return val;
	}
	//거스름돈을 계산하는 함수
	public static int cal(int val) {
		int cash=1000-val; //받아야 할 거스름돈 = 낸 돈 - 물건의 가격
		int result=0; // 거스름돈의 개수
		int[] value= {500,100,50,10,5,1}; //거스름돈의 단위를 저장하는 배열
		for(int count=0;count<value.length;count++) {// 거스름돈의 단위만큼 반복
			
			//for문 해석 - 받아야 할 돈이 거스름돈의 단위보다 많을 때 거스름돈만큼 빼는 행위를 반복 (받아야 할 돈이 거스름돈의 단위보다 적을 경우 정지)
			// 받아야 할 돈이 거스름돈의 단위보다 적다면 다음 단위로 넘어가 반복 (ex : 받아야 할 돈[432] 일 때 거스름돈 [500] -> 거스름돈 [100])
			for(;cash>=value[count];cash-=value[count]) { 
				result++; // 거스름돈의 개수 추가
			}
		}
		return result;
	}
	//조건에 맞는지 확인
	public static boolean validation_check(int val) {
		if(val>=1000||val<1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//실행부
		int val=cost_input();
		if(validation_check(val)) {
			System.out.println(cal(val));
		}		
	}
}
