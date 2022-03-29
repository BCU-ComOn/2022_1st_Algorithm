public package week03;
import java.util.Scanner;
public class Bj_2562 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int natural_number[] = {in.nextInt(),in.nextInt(),
		in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),
		in.nextInt(),in.nextInt()};
		int max = natural_number[0];
		int index = 0;
		for (int i = 0; i<natural_number.length;i++) {
			if (natural_number[i] > max) {
				max = natural_number[i];
				index = i+1;
			}
					}
	System.out.println("최대값 : "+max);
	System.out.println("인덱스 위치"+index);
	}
}
class bj2562_pjh {
    
}
