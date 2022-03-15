package wwwe;

import java.util.Scanner;

public class koi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int pow = 2;
		int result1,result2,result3,result4,result5;
		
		int max;
		
		result1 = (int) Math.pow(num1, pow);
		result2 = (int) Math.pow(num2, pow);
		result3 = (int) Math.pow(num3, pow);
		result4 = (int) Math.pow(num4, pow);
		result5 = (int) Math.pow(num5, pow);
		
		max = (result1+result2+result3+result4+result5) % 10;
		System.out.println(max);
		
		

	}

}