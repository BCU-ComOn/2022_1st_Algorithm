import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); //총 일수
		int A = sc.nextInt(); //총 국어 페이지
		int B = sc.nextInt(); //총 수학 페이지
		int C = sc.nextInt(); //하루 국어 푼 페이지
		int D = sc.nextInt(); //하루 수학 푼 페이지
		
		int BD = B/D; //수학 최대 일수
		int AC = A/C; //국어 최대 일수
		
		if(B%D!=0) { 
			BD += 1;	
		}
		if(A%C!=0) {
			AC += 1;	
		}
		if(BD>AC) {
			L -= BD;
		}
		else if(AC > BD) {
			L -= AC;
		}
		else {
			L -= AC;
		}
		System.out.println(L);
	}

}
