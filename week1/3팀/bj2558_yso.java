import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        result(scanner);
	    }
                
	public static void result(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();  
        System.out.println(a + b);
	}
}