
import java.util.Scanner;
// 목표 : 입력된 두 수를 모두 거꾸로 바꿔 그 중에 더 큰 수를 출력하는 프로그램 작성
public class bj2908_lsj {
	// 두 수의 입력을 문자열로 받아 나눠 "문자열의 배열"에 저장 (문자열 두개로 받아서 배열로 반환해도 된다.)
	public static String[] str_input() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] str_arr=str.split("\\s");
		input.close();
		return str_arr;
	}
	// 문자열을 뒤집어진 정수로 바꾸는 함수
	public static int[] str_to_inverted_int(String[] str) {
		// 3자리인 각 문자열의 char을 하나씩 추출해 순서를 뒤집어 char 배열에 저장한다.
		char[] first_num= {str[0].charAt(2),str[0].charAt(1),str[0].charAt(0)};
		char[] second_num= {str[1].charAt(2),str[1].charAt(1),str[1].charAt(0)};
		// char 배열에 저장된 값을 문자열로 바꿔 다시 저장 (정수로 변환하기 쉽게)
		String num1 = new String(first_num);
		String num2 = new String(second_num);
		int[] result= {Integer.parseInt(num1),Integer.parseInt(num2)}; // 반환하기 위해 정수로 바꾼 뒤 배열에 저장
		return result;
	}
	// 두 수의 크기를 비교하는 함수
	public static int compare_two(int[] val) {
		if(val[0]>val[1]) {
			return val[0];
		}else{
			return val[1];
		}
	}
	// 문자열의 값이 올바른지 확인 (문자열의 크기가 3 미만일 경우 str_to_inverted_int()함수에서 배열의 크기로 인한 오류가 발생함 )
	public static boolean String_validation_check(String[] val) {
		if(val[0].length()<3||val[1].length()<3) { //문자열의 크기 확인
			return false;
		}
		return true;
	}
	// 정수의 값이 올바른지 확인 (0이 포함된 경우와 조건에 맞지 않는 경우)
	public static boolean integer_validation_check(int[] val) {
		for(int count=0;count<val.length;count++) {
			if(val[count]<100 || val[count]>999) { // 조건에 맞지 않는 경우
				return false;
			}
			if((val[count]%100<10)) { // 십의 자리에 0이 있는 경우 (100을 나누었는데 10의 자리 숫자가 존재하지 않으면 나머지가 10보다 작다.)
				return false;
			}
			if(val[count]%10==0){ // 값을 10으로 나눈 나머지가 0인 경우 (10으로 나눈 나머지가 없는 경우는 일의 자리가 0인 경우이다.)
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//실행부
		String[] str_arr=str_input(); //문자열을 입력하고 배열에 저장한 뒤
		if(String_validation_check(str_arr)) { // 입력된 문자열이 올바르다면
			int[] values=str_to_inverted_int(str_arr); // 문자열을 정수로 바꿔 배열에 저장하고
			if(integer_validation_check(values)) { // 변환된 정수가 올바르다면
				int result=compare_two(values); // 두 값을 비교해 큰 값을 반환하고
				System.out.println(result); // 출력한다.
			}
		}
	}
}
