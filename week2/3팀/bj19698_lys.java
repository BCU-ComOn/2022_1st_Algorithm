import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		int W =  sc.nextInt();
		int H =  sc.nextInt();
		int L =  sc.nextInt();
		int cow = (W / L) * (H / L);
		
		if(cow >= N) {
			System.out.println(N);
		}else {
			System.out.println(cow);
		}
		
	}

}
