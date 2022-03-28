package Week02;

import java.util.Scanner;
import java.math.BigInteger;

public class bj1297_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double D = in.nextInt(); 	// 대각선 길이
		double H = in.nextInt(); 	// 높이
		double W = in.nextInt(); 	// 폭
		
		// D^2 = (H*i)^2 + (W*i)^2
		// i^2 = D^2 / (H^2 + W^2)
		double ratio = Math.sqrt(D*D/(H*H+W*W));
		
		System.out.println((int) (ratio * H) + " " +(int)( ratio * W));
	
	}
}
