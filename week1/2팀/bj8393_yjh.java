package wwwe;

import java.util.Scanner;

public class bj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num1 = new Scanner(System.in);
		
		int n = num1.nextInt();
		int sum = 0;
		
		for (int i=1 ; i<=n ; i++)
			sum = sum + i;
		
		System.out.println(sum);
		

	}

}
