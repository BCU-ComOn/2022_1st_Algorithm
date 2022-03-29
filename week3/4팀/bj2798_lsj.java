
import java.util.Scanner;
// 목표 : 블랙 잭 - 카드 수와 목표 숫자를 첫 번째 라인에 입력받고, 두 번째 라인에 카드 수만큼의 값을 입력받아 목표 숫자와 제일 근접하지만 초과하지 않는 세 수의 합 출력
public class bj2798_lsj {
	// 스캐너를 전역 변수로 선언 (NoSuchElements 예방)
	public static Scanner input=new Scanner(System.in);
	// 입력된 문자열을 나눠 정수의 배열로 바꾸는 함수
	public static int[] split_str_to_int_arr(String str) {
		String[] str_arr=str.split("\\s"); // str을 나눠 str_arr이라는 문자열의 배열에 저장
		int[] int_arr=new int[str_arr.length]; // 나눠진 문자열의 개수와 같은 크기의 (str_arr의 크기와 같은) 배열 선언
		// 바로 위에서 선언한 정수 배열에 각각 문자열을 정수로 변환해 저장
		for(int count=0;count<str_arr.length;count++) { 
			int_arr[count]=Integer.parseInt(str_arr[count]);
		}
		return int_arr;
	}
	// 문자열을 입력받는 함수
	public static String input_str() {
		String str=input.nextLine();
		return str;
	}
	// 블랙잭 함수 - 주어진 카드 중에서 세 개 카드의 합이 가장 크고 목표를 초과하지 않는 값을 찾아 반환하는 함수 
	public static int blackJack(int[] cards,int[] rules) {
		int target_val=rules[1]; //목표값
		int card_len=cards.length; //카드의 개수 
		int max=0; //최대값

		// 3중 for 문을 이용해 모든 경우의 수를 탐색 (첫번째 카드 - 두번째 카드 - 세번째 카드)
		// 첫 번째 카드를 하나씩 선택
		for(int first_card=0;first_card<card_len;first_card++) {
			// 두 번째 카드를 하나씩 선택
			for(int second_card=0;second_card<card_len;second_card++) {
				// 첫 번째 카드와 같은 카드를 뽑아 사용할 수 없으므로 같은 카드가 선택되면 스킵한다.
				if(second_card==first_card) {
					continue;
				}
				// 세 번째 카드를 하나씩 선택
				for(int third_card=0;third_card<card_len;third_card++) {
					// 이미 나온 카드를 뽑아 사용할 수 없으므로 한번이라도 사용된 적 있는 카드가 선택되면 스킵한다.
					if(third_card==first_card||third_card==second_card) {
						continue;
					}
					// sum이라는 변수에 세 카드의 합을 저장한다.
					int sum=cards[first_card]+cards[second_card]+cards[third_card];
					// 만약 목표값을 초과하지 않으면서 현재 최대값보다 큰 경우
					if(sum<target_val&&sum>max) {
						max=sum; // 최대값에 sum의 값을 저장한다.
					}else if(sum==target_val) { // 만약 목표값과 합이 동일한 경우 
						return sum; // 더 계산할 필요도 없이 현재의 sum이 최대값이므로 바로 반환한다.
					}
				}
			}
		}
		return max;
	}
	//입력된 값이 조건에 맞는지 확인하는 함수
	public static boolean validation_check(int[] r,int[] c) {
		if(r[0]>100&&r[0]<3) { // 카드의 개수가 올바른지
			return false;
		}
		if(r[1]>30000&&r[1]<10) { // 목표값이 올바른지
			return false;
		}
		// 카드의 값이 올바른지
		for(int count=0;count<c.length;count++) {
			if(c[count]<1&&c[count]>100000) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//실행부
		int[] rules=split_str_to_int_arr(input_str());
		int[] cards=split_str_to_int_arr(input_str());
		if(validation_check(rules, cards)) {
			System.out.println(blackJack(cards, rules));
		}
		//전역변수로 선언한 Scanner를 닫아 준다.
		input.close();
	}
}
