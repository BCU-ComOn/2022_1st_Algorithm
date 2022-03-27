import java.util.Scanner;

public class bj1297_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        double h = scan.nextDouble();
        double w = scan.nextDouble();

        System.out.println((int)(d*h/Math.sqrt((h*h)+(w*w))));
        System.out.println((int)(d*w/Math.sqrt((h*h)+(w*w))));
    }
}
