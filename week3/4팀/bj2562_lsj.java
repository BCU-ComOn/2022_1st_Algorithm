
import java.util.Scanner;
// 목표 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성
public class bj2562_lsj {
	// 9개의 입력을 받는 입력 함수 작성
	public static int[] input_value() {
		Scanner input = new Scanner(System.in);
		int[] values= {
				input.nextInt(),input.nextInt(),input.nextInt(),
				input.nextInt(),input.nextInt(),input.nextInt(),
				input.nextInt(),input.nextInt(),input.nextInt(),
		};
		input.close();
		return values;
	}
	// 최대값과 그 인덱스를 구하는 함수
	public static int[] largest_num(int[] val) {
		int max=0,index=0;
		for(int count=0;count<val.length;count++) { 
			if(val[count]>max) { // 선정된 수가 현재의 최대값보다 크다면 - -
				max=val[count]; // 그 수를 최대값으로 선정
				index=count+1; // "몇 번째 숫자인지" 
			}
		}
		int[] result = {max,index}; // 반환을 위해 배열에 저장
		return result;
	}
	// 배열을 출력하는 함수
	public static void arr_print(int[] arr) {
		for(int count=0;count<arr.length;count++) {
			System.out.println(arr[count]); // 배열 내부의 값을 출력
		}
	}
	// 입력된 값이 조건에 맞는지 확인하는 함수
	public static boolean input_validation_check(int[] arr) {
		for(int count=0;count<arr.length;count++) {
			if(arr[count]>=100||arr[count]<1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// 출력부
		int[] values=input_value();
		if(input_validation_check(values)) {
			values=largest_num(values);
			arr_print(values);
		}	
	}
}
