import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int enhwa[] = {500,100,50,10,5,1};
		
		int N = in.nextInt();
		int money = 1000 - N;
		
		int G = 0;
		int i = 0;
		
		while(money != 0)
		{
			G += money / enhwa[i];
			money = money % enhwa[i];
			i++;
		}
		
		System.out.println(G);
		
	}

}