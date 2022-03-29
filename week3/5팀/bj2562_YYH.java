import java.util.Scanner;

public class bj2562_YYH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[9];
        int max = 0; int num = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                num = i;
            }
        }

        System.out.println(max);
        System.out.println(num+1);
    }
}
