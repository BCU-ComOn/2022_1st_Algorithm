
import java.util.Scanner;
// 목표 : 피보나치 수열의 n번째 숫자를 구하는 프로그램 작성
public class bj10870_lsj {
	// 정수값을 입력받는 함수
	public static int input_val() {
		Scanner input = new Scanner(System.in);
		int val=input.nextInt();
		input.close();
		return val;
	}
	// 피보나치 수열을 계산하는 함수
	public static int cal(int val) {
		int[] arr=new int[val+1]; //피보나치 수열의 n번째까지 계산하기 위해 배열의 크기를 1 늘린다. 
		// val이 2보다 작은 경우에서 arr[1]에 값을 대입하려 시도할 경우 val[1]은 존재하지 않는 배열의 인덱스이므로 배열 크기 오류가 발생한다. 따라서 val이 2보다 작은 경우를 따로 계산한다.
		if(val<2) { //2보다 작은 경우
			return val; //그대로 반환 (피보나치 수열의 0번째 수와 1 번째 수는 각각 0, 1이므로)
		}else { //2거나 2보다 큰 경우
			arr[0]=0;arr[1]=1;
			for(int count=2;count<arr.length;count++) { //목표값까지 계산
				arr[count]=arr[count-1]+arr[count-2]; // 피보나치 수열
			}
		}
		return arr[val];
	}
	//값이 올바른지 확인하는 함수
	public static boolean validation_check(int val) {
		if(val>20||val<0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//실행부
		int val=input_val();
		if(validation_check(val)) {
			System.out.println(cal(val));
		}
	}
}
