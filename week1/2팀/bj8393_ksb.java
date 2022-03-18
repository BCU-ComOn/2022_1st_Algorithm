package Week_1;

import java.util.Scanner;

public class test_4 {

	public static void main(String[] args) {
		// 합
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num = in.nextInt();
		for(int i = 1; i <= num; i++) {
			sum += i;
		} 
		System.out.println(sum);
	}

}
