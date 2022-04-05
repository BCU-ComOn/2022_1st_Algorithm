import java.util.Scanner;
// 목표 : 대소문자를 거꾸로 출력하는 프로그램 작성
public class bj2744_lsj {
	//입력부
	public static String input() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		return str;
	}
	//문자열의 대소문자를 거꾸로 변환해 반환하는 함수 작성
	public static String reverse_char(String str) {
		char[] ch=new char[str.length()]; //문자열의 크기만큼 문자열을 저장할 char의 배열 선언
		for(int count=0;count<str.length();count++) {
			ch[count]=str.charAt(count); //문자열의 n번 인덱스에 위치한 문자가 문자 배열의 n번째 인덱스로 전달됨 (String -> char[])
		}
		for(int count=0;count<ch.length;count++) {
			char temp=ch[count]; 
			if(temp>=65&&temp<=90) { //대문자라면
				ch[count]=Character.toLowerCase(temp); //소문자로
			}else {// 그 외의 경우
				ch[count]=Character.toUpperCase(temp); //대문자로
			}
		}
		//문자의 배열을 문자열로 변환할 배열을 미리 선언
		String result=new String();

		//ch[] . 문자의 배열을 문자열로 바꿔서 반환하도록 하는 함수
		for(int count=0;count<ch.length;count++) {
			result+=Character.toString(ch[count]); 
		}
		return result;
	}
	public static void main(String[] args) {
		//실행부
		String str = input();
		String result = reverse_char(str);
		System.out.println(result);
	}
}
