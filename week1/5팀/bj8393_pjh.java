package test1;
import java.util.Scanner;
public class bj8393_pjh  {
	    public static void main(String[] args) {
	        Scanner tes = new Scanner(System.in);
	        int a = tes.nextInt();
	        tes.close();
	        int sum = 0;

	        for (int i = 1; i <= a; i++){
	            sum += i;
	        }
	        System.out.println(sum);
	    }
	}
