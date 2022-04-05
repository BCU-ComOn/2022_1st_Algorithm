import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] small_boy = new int[9];
		int sum = 0;
		int A = 0, B = 0;

		for (int i = 0; i < small_boy.length; i++) { // 난쟁이 키 입력
			small_boy[i] = sc.nextInt();
			sum += small_boy[i]; // sum은 난쟁이 9명의 키의 합
		}
		Arrays.sort(small_boy); //키를 오름순서로 정렬
		
		for(int a = 0; a < small_boy.length-1; a++) { //브루트 포스
			for(int b = a+1; b < small_boy.length; b++) {
				if(sum - small_boy[a] - small_boy[b] == 100) { //핵심
					A = a;
					B = b;
					break;
				}
			}
		}
		
		for(int j = 0; j < small_boy.length; j++) { // 진짜 난쟁이 키 출력
			if(j == A || j == B) //주의
				continue;
			System.out.println(small_boy[j]);
		}
		sc.close();
	}
}