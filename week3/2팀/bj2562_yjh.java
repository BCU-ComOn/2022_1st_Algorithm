package wwwe;

import java.util.Scanner;

public class bj2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		};
		int max = num[0];
		int s = 0;
		for(int i=0; i<num.length; i++) {
			if(max<num[i])
				max = num[i];
				s = i;
		};
		
				
		System.out.println(max);
		System.out.println(s);
}

}
