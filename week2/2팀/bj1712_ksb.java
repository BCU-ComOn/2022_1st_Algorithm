package Week2;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// 손익분기점
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(c <= b) {
			System.out.println("-1");
		}
		else {
			System.out.println((a/(c-b)) + 1);
		}

	}

}
