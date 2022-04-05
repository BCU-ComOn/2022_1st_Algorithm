package week03;

import java.util.Scanner;

public class bj5585_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money = 1000 - in.nextInt();
		int[] moneyArr= {500, 100, 50, 10, 5, 1}; 
		int result = 0;
		int num = 0;
		
		for(int i = 0; i < moneyArr.length; i++) {
			if(money >= moneyArr[i]) {
				result += money / moneyArr[i];
				money -= moneyArr[i]*(money / moneyArr[i]);
				if(money == 0) {
					break;
				}
			}
		} 
		System.out.println(result);
	}

}
