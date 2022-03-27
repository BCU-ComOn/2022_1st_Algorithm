package wwwe;

import java.util.Scanner;

public class bj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int n1 = num.nextInt();
		int n2 = num.nextInt();
		int n3 = num.nextInt();
		int sum= 0;
		sum = (n1/(n3-n2)+1);
		
		if (n2 >= n3) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
		}
		}
	}