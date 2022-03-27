
import java.util.Scanner;

// 목표 : 소의 마릿수, 헛간의 너비, 헛간의 높이, 방의 목표 크기를 입력받아 최대한 많은 소가 들어가도록 할 수 있는 프로그램 작성
public class bj19698_lsj {
	//입력부
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] val= {
				input.nextInt(),
				input.nextInt(),
				input.nextInt(),
				input.nextInt()
		};
		input.close();
		return val;
	}
	// 소들이 들어갈 공간을 구하는 함수
	public static int room_size_cal(int[] val) {
		// 배열의 저장된 값을 보기 쉽게 정리
		int cow_num=val[0];
		int width=val[1];
		int height=val[2];
		int target_size=val[3]; //목표값 (방의 크기)
		// 공간이 있다면
		if(cow_num<(width/target_size)*(height/target_size)) {
			return cow_num;
		}else { //공간이 없다면
			return ((width/target_size)*(height/target_size)); 
		}
	}
	//값이 조건에 맞는지 확인하는 함수
	public static boolean validation_check(int[] val) {
		for(int index=0;index<val.length;index++) {
			if(val[index]<1||val[index]>1000) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// 실행부
		int[] val=input();
		if (validation_check(val)) {
			int result = room_size_cal(val);
			System.out.println(result);
		}
	}
}
