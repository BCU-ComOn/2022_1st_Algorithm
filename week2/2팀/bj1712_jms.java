import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt(); //고정
        int B = in.nextInt();  //가변
        int C = in.nextInt();  //가격
        
        if (C <=B) {
            System.out.println("-1");
        }
        else {
            System.out.println((A/(C-B))+1);
        }
        
        
    }
}