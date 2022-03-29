import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] number = {s.nextInt(), s.nextInt(), s.nextInt(), 
						s.nextInt(), s.nextInt(), s.nextInt(), 
						s.nextInt(), s.nextInt(), s.nextInt()};
		
		int count =0;
		int max = 0;
		int index = 0;
		
		for(int value:number) {
			count++;
		
			if(value > max) { 
			max = value;
			index = count;
		}
	}
		System.out.print(max + "\n" + index);
	}
}
