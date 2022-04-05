import java.util.Arrays;
import java.util.Scanner;

public class BJ2309_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = 9;
        int[] a =new int[x];

        for(int i = 0;i<x;i++) {
                a[i] = sc.nextInt();
                sum += a[i];
        }
        Arrays.sort(a);
        for (int i=0; i<x; i++) {
            for (int j=i+1; j<x; j++) {
                if (sum - a[i] - a[j] == 100) {
                    for (int k=0; k<x; k++) {
                        if (i == k || j == k){
                            continue;
                        }
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
