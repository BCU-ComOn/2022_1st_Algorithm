package wwwe;

import java.util.Scanner;

public class bj10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int s;	
		s = sc.nextInt();


		System.out.println(fibo(s));

	}

	
	public static int fibo(int n) {
		
		if (n <= 1)
			return n;
		else 
			return fibo(n-2) + fibo(n-1);
	}
}
