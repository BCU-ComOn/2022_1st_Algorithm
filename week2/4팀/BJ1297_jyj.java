import java.util.Scanner;

public class BJ1297_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        double D = sc.nextInt();// 대각선
        double H = sc.nextInt();// 높이
        double W = sc.nextInt();// 너비

        double a = Math.sqrt(D*D/(H*H + W*W));
        System.out.println((int)(a * H) + " " +(int)(a * W));
    }
}
