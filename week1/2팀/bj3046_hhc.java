import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int R1 = in.nextInt();
		int aver = in.nextInt();
		int R2 = (aver*2)-R1;
		
		System.out.println(R2);
		
		in.close();
	}

}
