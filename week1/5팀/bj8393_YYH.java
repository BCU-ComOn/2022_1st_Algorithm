import java.util.Scanner;

public class bj8393_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            count += i;
        }

        System.out.println(count);
    }
}
