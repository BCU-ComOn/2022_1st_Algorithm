package week02;

import java.util.Scanner;

public class bj5532_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		int ko,mt;
		
		ko = (a+c-1)/c;
		mt = (b+d-1)/d;
		
		if(ko>=mt) {
			System.out.println(l-ko);
		}else {
			System.out.println(l-mt);
		}
	}

}
