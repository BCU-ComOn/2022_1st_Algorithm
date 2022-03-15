package Week_1;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// 검증수
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int num = in.nextInt();
			sum += num * num;
		}
		
		int all = sum % 10;
		System.out.println(all);

	}

}
