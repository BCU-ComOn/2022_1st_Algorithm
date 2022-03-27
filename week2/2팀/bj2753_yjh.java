package wwwe;

import java.util.Scanner;

public class bj2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int n1 = num.nextInt();
		
		if (n1 % 4 == 0) {
			if (n1 % 400 == 0) {
				System.out.println(1);
			}
		}
		else if (n1 % 100 != 0) {
			System.out.println(0);
		}
	}

}