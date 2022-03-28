package week_2;
import java.util.Scanner;
public class bj1712_pjh {

	public static void main(String[] args) {
		Scanner ex = new Scanner (System.in);	

		int a = ex.nextInt();
		int b = ex.nextInt();
		int c = ex.nextInt();
		int bef = a/(c-b)+1;
		
		if(c-b <=0) {
			System.out.println("-1");
		}
		else {
			System.out.println(bef);
		}
	}
}
//

