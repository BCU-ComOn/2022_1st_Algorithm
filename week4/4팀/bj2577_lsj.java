import java.util.Scanner;
// 목표 : 세 정수를 곱한 값에 각 숫자가 몇 번 들어가는지 출력
public class bj2577_lsj {
	// 입력부
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] value= {input.nextInt(),input.nextInt(),input.nextInt()};
		input.close();
		return value;
	}
	// 입력된 세 수를 곱하고 숫자의 개수를 구하는 함수
	public static int[] number(int[] val) {
		int[] counts={0,0,0,0,0,0,0,0,0,0}; //순서대로 0,1,2...9의 숫자가 몇 번 나왔는지 저장하는 배열 선언
		int mult=val[0]*val[1]*val[2]; // 세 값의 곱을 저장할 변수 선언
		String summary_str=Integer.toString(mult); //세 값의 곱을 문자열로 변환
		for(int count=0;count<summary_str.length();count++) { //문자열의 크기만큼 반복 (자릿수만큼)
			int temp=Character.getNumericValue(summary_str.charAt(count)); //문자열의 index번에 존재하는 char을 추출해 정수로 바꿔 temp에 저장
			counts[temp]++; //temp에 해당하는 숫자의 카운트 증가
		}
		//값 반환
		return counts;
	}
	//배열 출력
	public static void print_arr(int[] counts) {
		for(int count=0;count<counts.length;count++) {
			System.out.println(counts[count]);
		}
	}
	public static void main(String[] args) {
		//실행부
		int[] value=input();
		int[] result=number(value);
		print_arr(result);
	}
}
