import java.util.Scanner;

public class bj5532_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        for (int i = 1; ; i++) {
            if(a <= c*i && b <= d*i){
                System.out.println(l-i);
                break;
            }
        }
    }
}
