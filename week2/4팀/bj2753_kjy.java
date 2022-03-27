package Week02;

import java.util.Scanner;

public class bj2753_kjy {
	public static void main(String[] args) {
		int year = 0;
		
		Scanner in = new Scanner(System.in);
		
		year = in.nextInt();
		 
		if (((year % 4 == 0) && (!(year % 100 == 0))) || (year % 400 == 0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	
	}

}
