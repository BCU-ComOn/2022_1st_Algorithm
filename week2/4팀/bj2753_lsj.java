package week2;
import java.util.Scanner;
public class bj2753_lsj {
	public static int input() {
		Scanner in = new Scanner(System.in);
		int input=in.nextInt();
		in.close();
		return input;
	}
	public static int find_yoon(int year) {
		if(year%4!=0) {
			return 0;
		}else if(year%100==0) {
			if(year%400==0) {
				return 1;
			}
			return 0;
		}else {
			return 1;
		}
	}
	public static boolean validation_check(int y) {
		if(y>0&&y<4001) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int val=input();
		if(validation_check(val)) {
			int result= find_yoon(val);
			System.out.println(result);
		}
	}
}
