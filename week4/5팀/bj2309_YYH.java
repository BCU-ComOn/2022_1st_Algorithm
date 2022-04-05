import java.util.Scanner;
import java.util.Arrays;

public class bj2309_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tall = new int[9];
        int num = 0;
        int a = 0, b = 0;

        for (int i = 0; i < tall.length; i++) {
            tall[i] = scan.nextInt();
            num += tall[i];
        }
        Arrays.sort(tall);

        for (int i = 0; i < tall.length-1; i++) {
            for (int j = i+1; j < tall.length; j++) {
                if (num - tall[i] - tall[j] == 100) {
                    a = i;
                    b = j;
                }
            }
        }
        for (int i = 0; i < tall.length; i++) {
            if(i == a || i == b){
                continue;
            }
            System.out.println(tall[i]);
        }
    }
}
