package week03;
import java.util.Scanner;
public class Bj_10870 {
	public static int res(int a) {
		int result;
		if (a==0||a==1) {
			return a;
		}
		else {
			result=res(a-2)+res(a-1);
			return result;
		}
	}
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	System.out.println(res(n));
	}

}
