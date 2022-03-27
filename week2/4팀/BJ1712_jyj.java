import java.util.Scanner;

public class BJ1712_jyj {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(C <= B){
            System.out.println("-1");
        }
        else{
            System.out.println((A/(C-B)+1));
        }

    }
}
