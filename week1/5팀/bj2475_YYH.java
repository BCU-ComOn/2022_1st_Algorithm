import java.util.Scanner;

public class bj2475_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        for(int i=0;i < 5;i++){
            int a = scan.nextInt();
            count += a*a;
        }

        System.out.println(count%10);
    }
}
