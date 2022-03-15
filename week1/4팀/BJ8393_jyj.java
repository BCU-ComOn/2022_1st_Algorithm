import java.util.Scanner;

public class BJ8393_jyj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int n = 1; n <= x; n++){
            sum += n;
        }
        System.out.println(sum);
    }
}
