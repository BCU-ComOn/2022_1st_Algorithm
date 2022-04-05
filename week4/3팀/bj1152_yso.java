import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		String[] letters = letter.split(" ");
		if (letters.length == 0) { 
			System.out.println(0);
			System.exit(0);
		}
		if (letters[0] == "") { 
			System.out.println(letters.length - 1);
		}  else {
			System.out.println(letters.length);
		}
	}
}
