import java.util.Scanner;

public class BJ2577_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum =  a * b * c;
        String str = Integer.toString(sum);
        sc.close();

        for(int i = 0; i < 10; i++){
            int count = 0;
            for(int j = 0; j <str.length();j++){
                if((str.charAt(j) - '0')== i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
