import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		int sum = 0;
		
		int i;
		
		for(i=1;i<=a;i++) {
		sum+= i;
		}
		System.out.println(sum);
		in.close();
	}

}
