package week04;

import java.util.*;

public class bj5585_kjy {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int pay = in.nextInt();
		int charge = 1000 - pay;
		int cnt = 0;
		
		cnt += charge / 500;
		charge %= 500;
		cnt += charge /100;
		charge %= 100;
		cnt += charge / 50;
		charge %= 50;
		cnt += charge /10;
		charge %= 10;
		cnt += charge / 5;
		charge %= 5;
		cnt += charge /1;
		charge %= 1;

		System.out.println(cnt);
	}

}
