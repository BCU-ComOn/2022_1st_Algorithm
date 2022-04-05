import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1152_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(a," ");

        System.out.println(st.countTokens());
    }
}
