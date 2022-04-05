import java.util.Scanner;
// 목표 : 테스트 개수를 입력하고, 입력받은 횟수만큼 각 문자를 반복 출력
public class bj2675_lsj {
	//입력부
	public static String[] test_input() {
		Scanner input = new Scanner(System.in);
		int val=input.nextInt();
		String[] testcase=new String[val+1]; //반복될 횟수를 입력받고
		testcase[0]=Integer.toString(val); //한번에 반환하기 위해 자료형을 통일해 배열에 저장한다.
		for(int count=0;count<val;count++) {
			int int_temp=input.nextInt(); //반복할 횟수를 입력
			String str_temp=input.next(); //반복할 문자열을 입력
			testcase[count+1]=Integer.toString(int_temp)+" "+str_temp;//반복할 횟수와 문자열을 합쳐 testcase 배열에 저장
		}
		input.close();
		return testcase;
	}
	//연산을 마친 뒤의 문자열을 반환하는 함수 반환
	public static String[] testcase(String[] str_arr) {
		String[] str=new String[str_arr.length-1]; // 맨 앞의 반복 횟수를 제한 나머지 값들을 저장할 배열 선언
		for(int count=1;count<str_arr.length;count++) { //맨 앞의 반복 횟수를 제한 나머지 값들을 저장하는 함수
			str[count-1]=str_arr[count];
		}
		int len=Integer.parseInt(str_arr[0]); //몇 번 반복되는지
		int[] value=new int[len];  //정수만 따로 저장할 배열 선언
		String[] type=new String[len]; //문자열만 따로 저장할 배열 선언
		for(int count=0;count<len;count++) { 
			String[] temp=str[count].split("\\s"); // 반복 회수와 문자열을 나눠 temp에 저장
			value[count]=Integer.parseInt(temp[0].trim()); //양옆의 공백을 제거하고 왼쪽의 값을 정수로 변환해 정수 배열에 저장
			type[count]=temp[1].trim(); // 양옆의 공백을 제거하고 오른쪽의 값을 문자열 배열에 저장
		}
		String[] result=new String[len]; //결과값을 저장할 배열 미리 선언
		for(int count=0;count<len;count++) {
			String temp="";
			for(char chr:type[count].toCharArray()) { //type[count]를 char의 배열로 변환한 뒤 char 배열에서 그 길이만큼 char을 하나씩 호출
				for(int repeat=0;repeat<value[count];repeat++) { //반복 횟수만큼 문자를 반복해 출력
					temp+=chr;
				}
			}
			result[count]=temp; //결과값에 temp 저장
		}
		return result; //값 반환
	}
	//출력하는 함수
	public static void print(String[] str) {
		if(str==null) {	//문자열이 비었다면 (잘못된 입력) 아무 출력도 하지 않는다.
		}else {
			for(int count=0;count<str.length;count++) {
				System.out.println(str[count]);
			}
		}
	}

	public static void main(String[] args) {
		// 실행부
		String[] str=test_input();
		String[] test=testcase(str);
		print(test);
	}
}
