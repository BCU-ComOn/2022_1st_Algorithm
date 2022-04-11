import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine(); 
		S = S.trim(); 
		String ans[] = S.split(" "); 
		if(ans.length == 1 && ans[0].equals("")) {
			System.out.println(0);
		}else {
			System.out.println(ans.length);
		}
	}
}
