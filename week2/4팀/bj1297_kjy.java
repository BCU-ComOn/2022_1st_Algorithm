package Week02;

import java.util.Scanner;
import java.math.BigInteger;

public class bj1297_kjy {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double D = in.nextInt(); 	// �밢�� ����
		double H = in.nextInt(); 	// ����
		double W = in.nextInt(); 	// ��
		
		// D^2 = (H*i)^2 + (W*i)^2
		// i^2 = D^2 / (H^2 + W^2)
		double ratio = Math.sqrt(D*D/(H*H+W*W));
		
		System.out.println((int) (ratio * H) + " " +(int)( ratio * W));
	
	}
}
