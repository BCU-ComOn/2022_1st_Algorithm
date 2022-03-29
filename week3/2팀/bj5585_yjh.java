package wwwe;

import java.util.Scanner;

public class bj5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 1000-n;
		int h = 0;
		
		if (sum>=500){
			int n1 = sum/500;
			sum = sum-(500*n1);
			h += n1;
		};
		if (sum>=100){
			int n2 = sum/100;
			sum = sum-(100*n2);
			h += n2;
		};
		if (sum>=50){
			int n3 = sum/50;
			sum = sum-(50*n3);
			h += n3;
		};
		if (sum>=10){
			int n4 = sum/10;
			sum = sum-(10*n4);
			h += n4;
		};
		if (sum>=5){
			int n5 = sum/5;
			sum = sum-(5*n5);
			h += n5;
		};
		if (sum>=1){
			int n6 = sum/1;
			sum = sum-(1*n6);
			h += n6;
		};
		
		System.out.println(h);
		
	}

}
