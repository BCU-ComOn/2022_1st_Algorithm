package week3;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// 거스름돈 5585
		Scanner in = new Scanner(System.in);
		
		int[] num = {500, 100, 50, 10, 5, 1};
		int money = 1000 - in.nextInt();
		int coin = 0;
		
		int index = 0;
		while(money != 0) {
			int change = money / num[index];
			money -= change * num[index++];
			coin += change;
		}
		
		System.out.println(coin);

	}

}
