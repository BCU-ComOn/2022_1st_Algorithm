import java.util.Scanner;

public class bj19698_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int l = scan.nextInt();

        int value = (w/l)*(h/l);

        if(n >= value){
            System.out.println(value);
        }else{
            System.out.println(n);
        }
    }
}
