import java.util.Scanner;

public class bj2744_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
            }
            else{
                System.out.print(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }
    }
}
