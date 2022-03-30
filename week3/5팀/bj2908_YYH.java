import java.util.Scanner;
import java.lang.StringBuffer;

public class bj2908_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String a_r;
        StringBuffer sa = new StringBuffer(a);
        String b = scan.next();
        String b_r;
        StringBuffer sb = new StringBuffer(b);

        a_r = sa.reverse().toString();
        b_r = sb.reverse().toString();

        if(Integer.parseInt(a_r) > Integer.parseInt(b_r)){
            System.out.println(a_r);
        }else{
            System.out.println(b_r);
        }
    }
}
