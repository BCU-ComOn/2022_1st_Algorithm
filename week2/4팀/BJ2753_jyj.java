import java.util.Scanner;

public class BJ2753_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();

        if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}