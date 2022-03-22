
import java.util.Scanner;
public class bj5532_lsj {
	// 입력부
	public static int[] input_value() {
		Scanner input = new Scanner(System.in);
		int[] values= {
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt()
				};
		input.close();
		return values;
	}
	// 놀 수 있는 날을 구하는 함수
	public static int free_day(int[] val) {
		int whole_day=val[0]; //전체 방학 날짜
		int spent_day_maximum=0; // 숙제를 하는 데 사용해야 할 날짜의 최대값
		// 국어 숙제를 마치는 데 소모하는 날짜의 최대값을 구한다.
		for(int kor_spent=1, kor_remaining=val[1];kor_remaining>0;kor_spent++,kor_remaining-=val[3]) { //남아있는 국어 숙제 val[1]장을 하루에 val[3]장씩 하여 남아있는 숙제가 1 미만일때까지 반복한다.
			spent_day_maximum=kor_spent;
		}
		// 수학 숙제를 마치는 데 소모하는 날짜의 최대값을 구한다.
		for(int math_spent=1, math_remaining=val[2];math_remaining>0;math_spent++,math_remaining-=val[4]) {
			if(math_spent>spent_day_maximum) { //수학 숙제를 하는 데 소모한 날짜가 국어 숙제를 마치는 데 소모한 날짜보다 많다면 
				spent_day_maximum=math_spent; //소모하는 날짜의 최대값을 수학 숙제를 모두 마치는 데 소모한 날짜 (국어, 수학을 합쳐 가장 큰 날짜)로 바꾼다.
			}
		}
		//숙제 없이 놀 수 있는 날을 구한다. ( 전체 일수 - 숙제를 하는데 소모하는 일수 = 숙제 없는 날 )
		int freedom_day=whole_day-spent_day_maximum;
		return freedom_day; //반환
	}
	//값이 조건에 맞는지 확인하는 함수
	public static boolean validation_check(int[] val) {
		if(val[0]<2||val[0]>40) {
			return false;
		}
		if((val[1]<1||val[1]>1000)||(val[2]<1||val[2]>1000)) {
			return false;
		}
		if((val[3]<1||val[3]>100)||(val[4]<1||val[4]>100)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {

		//실행부
		int[] values=input_value();
		if(validation_check(values)) {
			int freedom_day=free_day(values);
			System.out.println(freedom_day);
		}
	}
}
