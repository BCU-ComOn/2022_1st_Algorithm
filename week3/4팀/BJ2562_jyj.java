import java.util.Scanner;

public class BJ2562_jyj {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        int a = 9;
        int array[]= new int[a];
        int num =0 , max = 0;

        for(int i = 0; a > i; i++ ){
            array[i] = sc.nextInt();
        }

        for(int i = 0; a > i; i++ ){
            if(array[i] > num ) {
                num = array[i];
                max = i + 1;
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}
