import java.util.Scanner;

public class BJ10870_jyj {

    private static int fibo(int x){
        if (x == 0) return 0;
        if (x == 1) return 1;
        return fibo(x - 1) + fibo(x - 2);
    }
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        System.out.println(fibo(x));
    }

}
