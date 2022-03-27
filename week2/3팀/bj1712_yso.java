import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c; // 고정비용을 a, 가변비용을 b, 판매이익을 c라 하자.
		a = s.nextInt();
		b = s.nextInt();	
		c = s.nextInt();

		if(b>=c) {
			System.out.println("-1");
			}else {
				System.out.println(a/(c-b)+1); //판매량 출력
			}
		}

}