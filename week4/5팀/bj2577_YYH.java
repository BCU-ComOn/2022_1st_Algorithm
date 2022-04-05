import java.util.Scanner;

public class bj2577_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt() * scan.nextInt() * scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(Integer.toString(sum).length() - Integer.toString(sum).replace(Integer.toString(i), "").length());
        }
    }
}
