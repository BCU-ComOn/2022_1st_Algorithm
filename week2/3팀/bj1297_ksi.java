import java.util.Scanner;

public class BJ_1297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int D = in.nextInt(); //대각선의 길이
		int H = in.nextInt(); //높이 비율
		int W = in.nextInt(); //너비 비율
		
		in.close();
		
		double d = Math.sqrt(Math.pow(H, 2)+Math.pow(W,2));
		
		int h = (int) Math.floor(H * (D / d));
		int w = (int) Math.floor(W * (D / d));
		
		System.out.println(h+ " " + w);
	}

}
