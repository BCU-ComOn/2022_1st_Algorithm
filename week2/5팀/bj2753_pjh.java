package week_2;
import java.util.Scanner;
public class Bj2753_pjh {

	public static int input() {
		Scanner ex = new Scanner (System.in);
		int years = ex.nextInt();
		ex.close();
		return years;
	}
	public static int judge(int year) {
		if(year%4==0) {
			if (year%100!=0|year%400==0);
				return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		int years = input();
		int result = judge(years);
		System.out.print(result);
	}

}
