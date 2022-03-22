package week2;

import java.util.Scanner;
public class bj1712_lsj {
	//condition - below 21uk is int 
	// input
	public static int[] user_in() {
		Scanner input = new Scanner(System.in);
		int[] val= {input.nextInt(), input.nextInt(), input.nextInt()};
		input.close();
		return val;
	}
	public static int seek_break_even_point(int[] val){
		int minus_val=-val[0];
		int product_sell_benefit=val[2]-val[1];
		if(product_sell_benefit<1) {
			return -1;
		}
		for(int count=1;;count++) {
			minus_val+=product_sell_benefit;
			if(minus_val>0) {
				return count;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=user_in();
		int result=seek_break_even_point(val);
		System.out.println(result);
	}
}
