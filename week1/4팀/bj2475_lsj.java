import java.util.Scanner;

public class bj2475_lsj {
	// 입력부
	public static String value_input() {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		return str;
	}
	// 입력받은 값을 정수로 바꾸는 함수
	public static int[] extract_value(String str) {
		//정수로 변환된 값을 저장할 변수 선언
		int[] keys=new int[5];
		//문자열을 공백 기준으로 나눔
		String[] strArr=str.split(" ");
        //나눠진 문자열을 각각 정수로 변환해 keys 배열에 저장
		for(int count=0;count<5;count++) {
			keys[count]=Integer.parseInt(strArr[count]);
		}
		return keys;
	}
	//결과값을 구해 반환하는 함수
	public static int result(int[] arr) {
		//더한 값을 저장할 변수 선언
		int sum=0;
		//배열의 값을 모두 제곱한 뒤 하나씩 더해 sum에 저장
		for(int count=0;count<5;count++) {
			sum+=arr[count]*arr[count];
		}
		//sum에 나머지 10 연산 후 반환
		return sum%10;
	}
	
	// MAIN
	public static void main(String[] args) {
		String str=value_input();
		int[] keys=extract_value(str);
		System.out.println(result(keys));
	}

}
