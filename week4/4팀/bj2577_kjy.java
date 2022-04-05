package Week05;

import java.util.*;

public class bj2577_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int sum = a*b*c;
		
		int arr [] = new int [10];
		
		while (sum >=10) {
			arr[sum%10] += 1;
			sum /= 10;
		}
		arr[sum] += 1;
		
		for (int i = 0;arr.length > i ;i++) {
			System.out.println(arr[i]);
		}
	}

}
