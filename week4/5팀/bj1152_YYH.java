import java.util.Scanner;

public class bj1152_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String count = scan.nextLine().trim();
        if(count.isEmpty()){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(count.split(" ").length);
    }
}

