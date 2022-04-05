import java.util.Scanner;
// 목표 : 입력된 단어의 개수 출력
// 주의사항 : 빈 문자열("")의 경우의 출력이 1이 되지 않도록 조심.
public class bj1152_lsj {
	//입력부
	public static String input() {
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		return str;
	}
	//입력받은 문자열에서 단어가 몇개인가
	public static int words(String str) {
		str=str.trim(); //문자열 맨 앞과 맨 뒤의 공백 제거
		String[] temp=str.split("\\s");//문자열을 공백을 기준으로 나누기 (단어 구분)
		if(temp[0]=="") return 0; //빈 문자열이면 0을 반환
		return temp.length; //단어 개수 출력
	}
	public static void main(String[] args) {
		//실행부
		String str=input();
		if(str.length()<=1000000) { //단어 수가 1,000,000을 넘어가는지 조건 확인
			System.out.println(words(str));
		}
	}
}
