package week1;
// 목표 : 검증수 5개의 제곱값을 모두 합친 뒤 나누기 10한 값 출력

import java.util.Scanner;

public class bj2475_lsj {
	// 입력 함수
	public static String value_input() {
		Scanner input=new Scanner(System.in);
		return input.nextLine();
	}
	//문자열을 나누어 5개의 정수로 변환하는 함수
	public static int[] extract_value(String str) {
		//정수가 들어갈 배열 선언
		int[] keys=new int[5];
		//문자열 나누기
		String[] strArr=str.split(" ");
        //나눈 문자열을 각각 정수화하여 배열에 넣기
		for(int count=0;count<5;count++) {
			keys[count]=Integer.parseInt(strArr[count]);
		}
		return keys;
	}
	//값을 모두 제곱하여 10을 나눠 나머지를 구하는 함수
	public static int result(int[] arr) {
		//제곱된 값의 합이 저장될 변수 선언
		int sum=0;
		//배열 안의 값을 제곱하여 sum에 더하는 것
		for(int count=0;count<5;count++) {
			sum+=arr[count]*arr[count];
		}
		//값 반환
		return sum%10;
	}
	
	// MAIN
	public static void main(String[] args) {
		String str=value_input();
		int[] keys=extract_value(str);
		System.out.println(result(keys));
	}

}
