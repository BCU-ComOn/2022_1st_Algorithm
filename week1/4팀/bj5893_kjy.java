package Week1;

import java.util.Scanner;

public class bj5893_kjy {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	
	int sum = 0;
	
	for(int i = in.nextInt(); i > 0; i--) {
		sum += i;
	}
	
	System.out.println(sum);
	
	}

}
