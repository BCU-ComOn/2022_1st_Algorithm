package week02;
import java.util.Scanner;
public class Week02_5532 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt(); //방학 일수
		int A = in.nextInt();//총 국어 숙제량
		int B = in.nextInt();//총 수학 숙제량
		int C = in.nextInt();//하루 최대 국어량
		int D = in.nextInt();//하루 최대 수학량
		int date = 0;
		for(int al=L; al>0; al--) {
			if(A<=0 && B<=0) {
				System.out.printf("놀 수 있는 날 : %d",al);
				break;
			}
			else {
				A-=C;
				B-=D;
			}
		}
		
		
	}

}
